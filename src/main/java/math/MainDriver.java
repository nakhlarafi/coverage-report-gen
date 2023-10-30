package math;

import soot.*;
import soot.options.Options;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDriver {
    public static void main(String[] args) {
        // Check if any arguments were passed
        if (args.length == 0) {
            System.err.println("Usage: java math.MainDriver [options] classname");
            System.exit(0);
        }

        // Extract custom arguments
        List<String> argsList = new ArrayList<>(Arrays.asList(args));

        // Default paths
        String defaultPath = Scene.v().defaultClassPath();
        String helperClassesPath = extractAndRemoveArg(argsList, "-helperClassesPath", "target/classes");
        String classesToInstrumentPath = extractAndRemoveArg(argsList, "-classesToInstrumentPath", "");

        // Set the soot-classpath with the paths provided
        Options.v().set_soot_classpath(defaultPath + ":" + helperClassesPath + ":" + classesToInstrumentPath);

        // Add a phase to the transformer pack
        Pack jtp = PackManager.v().getPack("jtp");
        jtp.add(new Transform("jtp.instrumenter", new InvokeStaticInstrumenter()));

        // Pass control to Soot
        soot.Main.main(argsList.toArray(new String[0]));
    }

    /**
     * Extracts the value for the given argument key and removes both the key and value from the list.
     * If the key is not found, returns the default value.
     */
    private static String extractAndRemoveArg(List<String> argsList, String argKey, String defaultValue) {
        int index = argsList.indexOf(argKey);
        if (index != -1 && argsList.size() > index + 1) {
            String value = argsList.get(index + 1);
            argsList.remove(index + 1);  // remove value
            argsList.remove(index);      // remove key
            return value;
        }
        return defaultValue;
    }
}
