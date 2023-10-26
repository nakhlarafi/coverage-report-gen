package math;/* Usage: java math.MainDriver [soot-options] appClass
 */


/* import necessary soot packages */
import soot.*;
import soot.options.Options;

public class MainDriver {
    public static void main(String[] args) {

        /* check the arguments */
        if (args.length == 0) {
            System.err.println("Usage: java math.MainDriver [options] classname");
            System.exit(0);
        }

//        /*Set the soot-classpath to include the helper class and class to analyze*/
//        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + ":target/classes:Sample/bin");
        String defaultPath = Scene.v().defaultClassPath();
        String helperClassesPath = "target/classes";
        String classesToInstrumentPath = "/Users/tahminaakter/Desktop/ECSE688/PA2/Profiler/Sample/";

        Options.v().set_soot_classpath(defaultPath + ":" + helperClassesPath + ":" + classesToInstrumentPath);

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");
        jtp.add(new Transform("jtp.instrumenter",
                new InvokeStaticInstrumenter()));

        /*
         * Give control to Soot to process all options,
         * InvokeStatic Instrumenter.internalTransform will get called.
         */

        for(String arg:args){
            System.out.println(arg);
        }
        soot.Main.main(args);
    }
}