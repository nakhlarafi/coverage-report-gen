package math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 1, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 0);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass24 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 1);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (short) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (short) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (short) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 1);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.RadixSort(intArray1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 1);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 1);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (short) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (short) 0);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 1);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (short) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.HeapSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (byte) 0);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 1);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (short) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 0);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 1);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 0);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, (int) (short) 1);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, 1);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 1);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, (int) (byte) 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 1);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (byte) 0);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        int[] intArray4 = new int[] { (byte) 100, ' ', (byte) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray4, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, -1, 10]");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        int[] intArray1 = new int[] { (short) 0 };
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (byte) 0);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, (int) (byte) 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        int[] intArray2 = new int[] { 'a', (-1) };
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 97]");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (short) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (short) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, (int) (byte) 1);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (short) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, (int) (byte) 1);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        int[] intArray2 = new int[] { 'a', (-1) };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 97]");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 1);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 1);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, (int) (byte) 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 0);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 1);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        int[] intArray1 = new int[] { (short) 0 };
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }
}

