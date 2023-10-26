package math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        math.Sort.swapInQuickSort(intArray2, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
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
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        math.Sort.swapInQuickSort(intArray2, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        math.Sort.swapInQuickSort(intArray2, 1, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
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
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
            math.Sort.swapInQuickSort(intArray2, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
            math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        math.Sort.HeapSort(intArray2);
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
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 1);
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
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (short) 0);
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
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
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
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, 0);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
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
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
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
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
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
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
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
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.QuickSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
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
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        math.Sort.swapInQuickSort(intArray6, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
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
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        int[] intArray2 = new int[] { 'a', (-1) };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, -1]");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
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
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
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
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
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
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.HeapSort(intArray2);
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
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
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
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, 0);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        math.Sort.MergeSort(intArray2);
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
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
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
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.swapInQuickSort(intArray3, (int) (short) 0, (int) (short) 1);
        math.Sort.QuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        int[] intArray2 = new int[] { 'a', (-1) };
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 97]");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.QuickSort(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 0);
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
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
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
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
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
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        math.Sort.swapInQuickSort(intArray6, 1, (int) (byte) 1);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        math.Sort.swapInQuickSort(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.RadixSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, 0);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
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
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
            math.Sort.swapInQuickSort(intArray2, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.HeapSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
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
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
            math.Sort.swapInQuickSort(intArray2, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        math.Sort.HeapSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, 0);
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
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 1, 0);
        math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
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
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
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
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        math.Sort.swapInQuickSort(intArray6, 0, (int) (short) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
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
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
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
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
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
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, 0);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        math.Sort.HeapSort(intArray6);
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
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.HeapSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
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
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        int[] intArray1 = new int[] { (short) 10 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
        math.Sort.swapInQuickSort(intArray6, (int) (short) 1, (int) (byte) 1);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
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
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
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
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.HeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.HeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
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
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
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
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 1);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
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
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
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
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
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
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 0, (int) (short) 1);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
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
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        math.Sort.HeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
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
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
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
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
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
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        int[] intArray2 = new int[] { 'a', (-1) };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 97]");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
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
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
        math.Sort.swapInQuickSort(intArray2, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
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
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (short) 0, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
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
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
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
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
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
        math.Sort.HeapSort(intArray6);
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
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        math.Sort.swapInQuickSort(intArray2, (int) (short) 1, 0);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.HeapSort(intArray2);
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
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
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
        math.Sort.QuickSort(intArray3);
        math.Sort.HeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        int[] intArray1 = new int[] { (short) 0 };
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.MergeSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, (int) (short) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
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
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
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
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
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
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
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
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
            math.Sort.swapInQuickSort(intArray2, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
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
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
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
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.QuickSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
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
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
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
            math.Sort.swapInQuickSort(intArray6, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
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
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
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
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        int[] intArray2 = new int[] { 'a', (-1) };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 97]");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
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
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
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
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 0, 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
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
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
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
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
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
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.MergeSort(intArray3);
        math.Sort.QuickSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.RadixSort(intArray3);
        math.Sort.HeapSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray3, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
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
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
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
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
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
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
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
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
            math.Sort.swapInQuickSort(intArray6, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 1, 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
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
        math.Sort.MergeSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
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
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
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
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
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
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        math.Sort.HeapSort(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
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
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
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
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
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
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
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
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, (int) (byte) 1, (int) (byte) 0);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
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
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
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
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
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
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
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
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.QuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
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
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
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
            math.Sort.swapInQuickSort(intArray2, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
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
        math.Sort.HeapSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray6, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
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
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
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
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.swapInQuickSort(intArray6, 0, 0);
        math.Sort.MergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.RadixSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray1, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, 0);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
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
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
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
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
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
        math.Sort.HeapSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
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
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
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
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
            math.Sort.RadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.QuickSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        int[] intArray6 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        math.Sort.QuickSort(intArray6);
        math.Sort.QuickSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.MergeSort(intArray6);
        math.Sort.HeapSort(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
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
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
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
        math.Sort.HeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 97, 97, 100]");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
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
        math.Sort.MergeSort(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            math.Sort.swapInQuickSort(intArray2, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        int[] intArray2 = new int[] { (-1), 100 };
        math.Sort.QuickSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, 1, 1);
        math.Sort.MergeSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.HeapSort(intArray2);
        math.Sort.QuickSort(intArray2);
        math.Sort.MergeSort(intArray2);
        math.Sort.swapInQuickSort(intArray2, (int) (short) 0, (int) (short) 0);
        math.Sort.MergeSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        int[] intArray1 = new int[] { 100 };
        math.Sort.HeapSort(intArray1);
        math.Sort.QuickSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.RadixSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.MergeSort(intArray1);
        math.Sort.HeapSort(intArray1);
        math.Sort.HeapSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
    }
}

