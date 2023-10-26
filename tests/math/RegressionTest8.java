package math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (short) 1);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (short) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        math.Sort.MergeSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, 1);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        int[] intArray2 = new int[] { 'a', (-1) };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 97]");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 1, (int) (short) 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (short) 0);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        math.Sort.swapInQuickSort(intArray2, 0, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        int[] intArray1 = new int[] { (short) 10 };
        math.Sort.HeapSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        int[] intArray2 = new int[] { 'a', (-1) };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 97]");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
            math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.HeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 0);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, (int) (short) 0);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, (int) (short) 1);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        int[] intArray2 = new int[] { 'a', (-1) };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
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
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.swapInQuickSort(intArray3, 0, (int) (short) 1);
        math.Sort.QuickSort(intArray3);
        math.Sort.swapInQuickSort(intArray3, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        int[] intArray1 = new int[] { (short) 0 };
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
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
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (int) (byte) 1);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.HeapSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
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
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
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
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.QuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
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
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, (int) (short) 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
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
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (short) 1);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        int[] intArray1 = new int[] { (short) 0 };
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, 1);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
            math.Sort.swapInQuickSort(intArray6, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
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
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.QuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, 1);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass26 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        int[] intArray1 = new int[] { (short) 0 };
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        math.Sort.swapInQuickSort(intArray6, 1, 0);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
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
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.swapInQuickSort(intArray3, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
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
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
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
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        java.lang.Class<?> wildcardClass7 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
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
            math.Sort.swapInQuickSort(intArray6, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
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
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
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
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
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
        math.Sort.swapInQuickSort(intArray6, 0, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
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
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.swapInQuickSort(intArray3, 0, (int) (short) 1);
        math.Sort.QuickSort(intArray3);
        math.Sort.swapInQuickSort(intArray3, (int) (byte) 1, 1);
        math.Sort.RadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.QuickSort(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.HeapSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
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
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
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
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
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
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
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
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        int[] intArray1 = new int[] { (short) 10 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
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
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
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
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, 0);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.HeapSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
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
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.swapInQuickSort(intArray3, (int) (short) 1, (int) (short) 0);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
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
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
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
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
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
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
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
        math.Sort.swapInQuickSort(intArray6, 0, 1);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, 1);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.HeapSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.RadixSort(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
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
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        int[] intArray2 = new int[] { 'a', (-1) };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 97]");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
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
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
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
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }
}

