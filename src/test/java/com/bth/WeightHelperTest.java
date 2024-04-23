package com.bth;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import mutation.WeightHelper;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WeightHelperTest {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (short) 0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (byte) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1.0f), (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) '4', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        double double2 = WeightHelper.calculateBMI((double) 100.0f, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        double double2 = WeightHelper.calculateBMI((double) '4', (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 369.82248520710056d + "'", double2 == 369.82248520710056d);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (byte) -1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) ' ', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.Class<?> wildcardClass1 = weightHelper0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(1.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String str2 = WeightHelper.getCategory((double) 1L, (double) 10.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (byte) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String str1 = WeightHelper.getBMICategory(0.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(10.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String str1 = WeightHelper.getBMICategory((-1.0d));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String str2 = WeightHelper.getCategory((double) '4', (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 0L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.String str2 = WeightHelper.getCategory((double) 100L, (double) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        double double2 = WeightHelper.calculateBMI((double) (short) 10, 369.82248520710056d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36982.24852071005d + "'", double2 == 36982.24852071005d);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        double double2 = WeightHelper.calculateBMI((double) 10L, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9999.999999999998d + "'", double2 == 9999.999999999998d);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(36982.24852071005d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (short) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        double double2 = WeightHelper.calculateBMI((double) 'a', (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.628122010840684d + "'", double2 == 10.628122010840684d);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.lang.String str2 = WeightHelper.getCategory((double) 100.0f, (double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 0L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.String str1 = WeightHelper.getBMICategory(369.82248520710056d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.String str1 = WeightHelper.getBMICategory(100.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(0.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(0.0d, 369.82248520710056d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.String str2 = WeightHelper.getCategory((double) 10.0f, (double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.String str1 = WeightHelper.getBMICategory((double) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.String str1 = WeightHelper.getBMICategory(9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        double double2 = WeightHelper.calculateBMI((double) (short) 10, 10.628122010840684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1062.8122010840682d + "'", double2 == 1062.8122010840682d);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        double double2 = WeightHelper.calculateBMI(100.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.lang.String str2 = WeightHelper.getCategory((double) (byte) 100, 369.82248520710056d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.lang.String str1 = WeightHelper.getBMICategory(1.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.lang.String str2 = WeightHelper.getCategory((double) (short) 1, (double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.String str1 = WeightHelper.getBMICategory(10.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(0.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        double double2 = WeightHelper.calculateBMI(1.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10000.0d + "'", double2 == 10000.0d);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.String str1 = WeightHelper.getBMICategory(1062.8122010840682d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 0L, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((-1.0d), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1), 9999.999999999998d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) ' ', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 0.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (-1), (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.lang.String str1 = WeightHelper.getBMICategory((double) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (short) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        double double2 = WeightHelper.calculateBMI(10.628122010840684d, 36982.24852071005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3274011.871301774d + "'", double2 == 3274011.871301774d);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (-1L), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.String str2 = WeightHelper.getCategory((double) 10L, (double) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1.0f), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.String str2 = WeightHelper.getCategory(10.0d, (double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        double double2 = WeightHelper.calculateBMI((double) 10.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 10L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 0L, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        double double2 = WeightHelper.calculateBMI(100.0d, 10.628122010840684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.628122010840684d + "'", double2 == 10.628122010840684d);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.String str2 = WeightHelper.getCategory(10.0d, 10.628122010840684d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 100.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(10.628122010840684d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (short) -1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        double double2 = WeightHelper.calculateBMI((double) ' ', 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.65625d + "'", double2 == 97.65625d);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.String str1 = WeightHelper.getBMICategory(10000.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 1L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(0.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        double double2 = WeightHelper.calculateBMI((double) 10, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 999.9999999999998d + "'", double2 == 999.9999999999998d);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        double double2 = WeightHelper.calculateBMI(32.0d, 10000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97656.25d + "'", double2 == 97656.25d);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        double double2 = WeightHelper.calculateBMI((double) 100.0f, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.lang.String str1 = WeightHelper.getBMICategory((double) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        double double2 = WeightHelper.calculateBMI((double) (byte) 1, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1000000.0d + "'", double2 == 1000000.0d);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((-1.0d), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        double double2 = WeightHelper.calculateBMI((double) 10, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) '#', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.String str1 = WeightHelper.getBMICategory(999.9999999999998d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1L), 3274011.871301774d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.String str2 = WeightHelper.getCategory(97656.25d, 10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.lang.String str1 = WeightHelper.getBMICategory(3274011.871301774d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(1000000.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) '#', (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (byte) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (byte) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.lang.String str2 = WeightHelper.getCategory(97.65625d, 1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.lang.String str2 = WeightHelper.getCategory((double) (byte) 100, (double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (short) -1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.lang.String str2 = WeightHelper.getCategory(1062.8122010840682d, 99.99999999999999d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.lang.String str2 = WeightHelper.getCategory((double) (short) 10, 100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        double double2 = WeightHelper.calculateBMI((double) 10L, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9999.999999999998d + "'", double2 == 9999.999999999998d);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (byte) 0, 36982.24852071005d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.lang.String str2 = WeightHelper.getCategory((double) 10, 97.65625d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        double double2 = WeightHelper.calculateBMI(99.99999999999999d, 10.628122010840684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.628122010840686d + "'", double2 == 10.628122010840686d);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        double double2 = WeightHelper.calculateBMI(99.99999999999999d, 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.00000000000001d + "'", double2 == 32.00000000000001d);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.lang.String str2 = WeightHelper.getCategory((double) (byte) 1, (double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 0L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        double double2 = WeightHelper.calculateBMI((double) 100L, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 100L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.lang.String str2 = WeightHelper.getCategory(9999.999999999998d, (double) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.lang.String str1 = WeightHelper.getBMICategory(1000000.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.String str2 = WeightHelper.getCategory((double) 10L, 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        double double2 = WeightHelper.calculateBMI(1000000.0d, 1062.8122010840682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0628122010840683E-5d + "'", double2 == 1.0628122010840683E-5d);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.lang.String str1 = WeightHelper.getBMICategory(10.628122010840686d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        double double2 = WeightHelper.calculateBMI(10.628122010840686d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 885.2928099999997d + "'", double2 == 885.2928099999997d);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(10.628122010840686d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (byte) 0, 999.9999999999998d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.lang.String str2 = WeightHelper.getCategory(36982.24852071005d, (double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.lang.String str2 = WeightHelper.getCategory((double) (byte) 100, (double) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.lang.String str1 = WeightHelper.getBMICategory(32.00000000000001d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (short) -1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        double double2 = WeightHelper.calculateBMI(99.99999999999999d, 3274011.871301774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3274011.871301775d + "'", double2 == 3274011.871301775d);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (byte) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(1.0628122010840683E-5d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        double double2 = WeightHelper.calculateBMI((double) 10L, 1000000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999999E7d + "'", double2 == 9.999999999999999E7d);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (byte) 0, 10.628122010840684d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        double double2 = WeightHelper.calculateBMI(97.65625d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.8576d + "'", double2 == 104.8576d);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        double double2 = WeightHelper.calculateBMI(3274011.871301775d, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.851129230272279E-8d + "'", double2 == 4.851129230272279E-8d);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.String str2 = WeightHelper.getCategory(36982.24852071005d, 99.99999999999999d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((-1.0d), 36982.24852071005d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (byte) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        double double2 = WeightHelper.calculateBMI(999.9999999999998d, 9.999999999999999E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1000000.0000000001d + "'", double2 == 1000000.0000000001d);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((-1.0d), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        double double2 = WeightHelper.calculateBMI(97656.25d, 3274011.871301774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.433050271962129d + "'", double2 == 3.433050271962129d);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(10.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.lang.String str1 = WeightHelper.getBMICategory(99.99999999999999d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.lang.String str1 = WeightHelper.getBMICategory(1.0628122010840683E-5d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.lang.String str2 = WeightHelper.getCategory(369.82248520710056d, 3274011.871301774d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.lang.String str1 = WeightHelper.getBMICategory(4.851129230272279E-8d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (byte) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (byte) 0, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 0.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (short) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.lang.String str1 = WeightHelper.getBMICategory(104.8576d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((-1.0d), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.String str2 = WeightHelper.getCategory(1.0d, 10.628122010840684d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.lang.String str1 = WeightHelper.getBMICategory(9.999999999999999E7d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.lang.String str2 = WeightHelper.getCategory(4.851129230272279E-8d, 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((-1.0d), 3.433050271962129d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.lang.String str1 = WeightHelper.getBMICategory(97656.25d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        double double2 = WeightHelper.calculateBMI(104.8576d, 32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.10383045673371d + "'", double2 == 29.10383045673371d);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.lang.String str2 = WeightHelper.getCategory(100.0d, 9.999999999999999E7d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(10000.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        double double2 = WeightHelper.calculateBMI(1.0d, 999.9999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9999999.999999998d + "'", double2 == 9999999.999999998d);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 10.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.String str2 = WeightHelper.getCategory(10.628122010840684d, 10.628122010840686d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        double double2 = WeightHelper.calculateBMI((double) 1L, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100000.0d + "'", double2 == 100000.0d);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 0, 3274011.871301775d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (short) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.String str2 = WeightHelper.getCategory((double) '4', 10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        double double2 = WeightHelper.calculateBMI(104.8576d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.94947017729282d + "'", double2 == 90.94947017729282d);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.lang.String str1 = WeightHelper.getBMICategory(10.628122010840684d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 'a', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 1.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.lang.String str2 = WeightHelper.getCategory((double) 100.0f, 9.999999999999999E7d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(0.0d, 9999999.999999998d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        double double2 = WeightHelper.calculateBMI(1.0d, 9999999.999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999997E10d + "'", double2 == 9.999999999999997E10d);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.lang.String str2 = WeightHelper.getCategory((double) (byte) 10, (double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.String str1 = WeightHelper.getBMICategory(29.10383045673371d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Overweight" + "'", str1, "Overweight");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.lang.String str2 = WeightHelper.getCategory(1000000.0d, 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.lang.String str2 = WeightHelper.getCategory(10.628122010840684d, 104.8576d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 10.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.lang.String str2 = WeightHelper.getCategory((double) 1L, 9.999999999999999E7d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.lang.String str2 = WeightHelper.getCategory((double) 1, (double) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.lang.String str2 = WeightHelper.getCategory(100.0d, 9999999.999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.lang.String str2 = WeightHelper.getCategory(1.0628122010840683E-5d, (double) 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(0.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.lang.String str2 = WeightHelper.getCategory(999.9999999999998d, 999.9999999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(1000000.0000000001d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        double double2 = WeightHelper.calculateBMI(9999.999999999998d, 1062.8122010840682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10628122010840686d + "'", double2 == 0.10628122010840686d);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        double double2 = WeightHelper.calculateBMI(1.0628122010840683E-5d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.852928100000003E15d + "'", double2 == 8.852928100000003E15d);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.lang.String str1 = WeightHelper.getBMICategory(9999999.999999998d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.String str2 = WeightHelper.getCategory((double) (short) 10, (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.lang.String str2 = WeightHelper.getCategory(1062.8122010840682d, 3.433050271962129d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 0, 4.851129230272279E-8d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1L), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (-1), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(0.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        double double2 = WeightHelper.calculateBMI(100000.0d, 10000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01d + "'", double2 == 0.01d);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(36982.24852071005d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        double double2 = WeightHelper.calculateBMI(369.82248520710056d, 1000000.0000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 73116.16000000003d + "'", double2 == 73116.16000000003d);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        double double2 = WeightHelper.calculateBMI(97.65625d, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.8576d + "'", double2 == 104.8576d);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 0.0f, 36982.24852071005d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(0.0d, 999.9999999999998d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        double double2 = WeightHelper.calculateBMI(29.10383045673371d, 104.8576d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1237.94003928538d + "'", double2 == 1237.94003928538d);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(0.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        double double2 = WeightHelper.calculateBMI((double) 10, 100000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9999999.999999998d + "'", double2 == 9999999.999999998d);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.lang.String str2 = WeightHelper.getCategory((double) (byte) 1, (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(10.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        double double2 = WeightHelper.calculateBMI((double) (short) 100, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        double double2 = WeightHelper.calculateBMI(32.00000000000001d, 73116.16000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 714025.0d + "'", double2 == 714025.0d);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (byte) 0, 714025.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.lang.String str2 = WeightHelper.getCategory((double) '4', 97656.25d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1.0f), 3274011.871301774d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 'a', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 0L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.lang.String str1 = WeightHelper.getBMICategory((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1L), 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.lang.String str2 = WeightHelper.getCategory((double) '#', (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.lang.String str1 = WeightHelper.getBMICategory(100000.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        double double2 = WeightHelper.calculateBMI(999.9999999999998d, 9.999999999999997E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E9d + "'", double2 == 1.0E9d);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        double double2 = WeightHelper.calculateBMI((double) '#', 97.65625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 797.1938775510205d + "'", double2 == 797.1938775510205d);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(9.999999999999999E7d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.lang.String str2 = WeightHelper.getCategory(100.0d, 9.999999999999997E10d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        double double2 = WeightHelper.calculateBMI(10.628122010840686d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 885.2928099999997d + "'", double2 == 885.2928099999997d);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        java.lang.String str2 = WeightHelper.getCategory((double) 1L, 73116.16000000003d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.lang.String str2 = WeightHelper.getCategory(714025.0d, 9.999999999999999E7d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        double double2 = WeightHelper.calculateBMI((double) 10, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9999.999999999998d + "'", double2 == 9999.999999999998d);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (byte) 0, 90.94947017729282d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1.0f), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.lang.String str2 = WeightHelper.getCategory((double) 1L, 10000.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.lang.String str2 = WeightHelper.getCategory(714025.0d, 10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        double double2 = WeightHelper.calculateBMI(1.0d, 10000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E8d + "'", double2 == 1.0E8d);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        double double2 = WeightHelper.calculateBMI((double) (byte) 10, 10000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 999999.9999999998d + "'", double2 == 999999.9999999998d);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(1.0628122010840683E-5d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        double double2 = WeightHelper.calculateBMI(999999.9999999998d, 9.999999999999999E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 0.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(0.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.lang.String str2 = WeightHelper.getCategory(104.8576d, 10.628122010840686d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.lang.String str1 = WeightHelper.getBMICategory(1000000.0000000001d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.lang.String str2 = WeightHelper.getCategory((double) 100L, (double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.lang.String str2 = WeightHelper.getCategory(9.999999999999997E10d, 797.1938775510205d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        double double2 = WeightHelper.calculateBMI(36982.24852071005d, 3274011.871301774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.938317582400003d + "'", double2 == 23.938317582400003d);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        double double2 = WeightHelper.calculateBMI(714025.0d, 714025.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014005111865831029d + "'", double2 == 0.014005111865831029d);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.String str2 = WeightHelper.getCategory(1.0d, 99.99999999999999d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.lang.String str2 = WeightHelper.getCategory(1.0E8d, (double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        double double2 = WeightHelper.calculateBMI(10.628122010840686d, 36982.24852071005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3274011.871301773d + "'", double2 == 3274011.871301773d);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        double double2 = WeightHelper.calculateBMI(714025.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9614315837444108E-8d + "'", double2 == 1.9614315837444108E-8d);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        double double2 = WeightHelper.calculateBMI((double) (short) 100, 999.9999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 999.9999999999998d + "'", double2 == 999.9999999999998d);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (short) -1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.lang.String str1 = WeightHelper.getBMICategory(0.10628122010840686d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.lang.String str2 = WeightHelper.getCategory((double) (short) 100, 999.9999999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(0.014005111865831029d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        double double2 = WeightHelper.calculateBMI(3274011.871301774d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.329094673600543E-8d + "'", double2 == 9.329094673600543E-8d);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.String str1 = WeightHelper.getBMICategory(1.0E9d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.lang.String str1 = WeightHelper.getBMICategory(9.999999999999997E10d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.lang.String str2 = WeightHelper.getCategory(1062.8122010840682d, 1.0E8d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        double double2 = WeightHelper.calculateBMI(999999.9999999998d, 90.94947017729282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.094947017729286E-7d + "'", double2 == 9.094947017729286E-7d);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        double double2 = WeightHelper.calculateBMI(97656.25d, 1000000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.048576d + "'", double2 == 1.048576d);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(0.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.String str2 = WeightHelper.getCategory(3.433050271962129d, 1.0628122010840683E-5d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        double double2 = WeightHelper.calculateBMI((double) (byte) 1, 9999.999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999997E7d + "'", double2 == 9.999999999999997E7d);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.lang.String str2 = WeightHelper.getCategory((double) 1.0f, 8.852928100000003E15d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        double double2 = WeightHelper.calculateBMI((double) 10L, 9999999.999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999996E8d + "'", double2 == 9.999999999999996E8d);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        double double2 = WeightHelper.calculateBMI(714025.0d, 1.0628122010840683E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0846334187952071E-13d + "'", double2 == 2.0846334187952071E-13d);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.lang.String str1 = WeightHelper.getBMICategory((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        double double2 = WeightHelper.calculateBMI(0.014005111865831029d, 1000000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.09831700625E13d + "'", double2 == 5.09831700625E13d);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.lang.String str2 = WeightHelper.getCategory((double) 10L, 1237.94003928538d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        double double2 = WeightHelper.calculateBMI(3274011.871301775d, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.329094673600536E-10d + "'", double2 == 9.329094673600536E-10d);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.lang.String str1 = WeightHelper.getBMICategory(97.65625d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        double double2 = WeightHelper.calculateBMI(1.0628122010840683E-5d, 0.01d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.852928100000004E11d + "'", double2 == 8.852928100000004E11d);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(0.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.lang.String str2 = WeightHelper.getCategory(32.0d, 1.0E8d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        double double2 = WeightHelper.calculateBMI(1.0628122010840683E-5d, 0.10628122010840686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.409000000000006E12d + "'", double2 == 9.409000000000006E12d);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.lang.String str1 = WeightHelper.getBMICategory(797.1938775510205d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.lang.String str2 = WeightHelper.getCategory(8.852928100000003E15d, 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        double double2 = WeightHelper.calculateBMI(369.82248520710056d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7311616000000002d + "'", double2 == 0.7311616000000002d);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.lang.String str2 = WeightHelper.getCategory(0.7311616000000002d, (double) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(0.0d, 100000.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.lang.String str2 = WeightHelper.getCategory(3274011.871301775d, 8.852928100000003E15d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.String str2 = WeightHelper.getCategory(797.1938775510205d, 32.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(1062.8122010840682d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        double double2 = WeightHelper.calculateBMI(8.852928100000004E11d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2759278760810917E-20d + "'", double2 == 1.2759278760810917E-20d);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 0, 9.999999999999997E7d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        double double2 = WeightHelper.calculateBMI((double) 10, 1.0E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998E10d + "'", double2 == 9.999999999999998E10d);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (byte) 0, 3.433050271962129d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.lang.String str2 = WeightHelper.getCategory((double) (byte) 100, 100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.lang.String str2 = WeightHelper.getCategory(4.851129230272279E-8d, 32.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.lang.String str1 = WeightHelper.getBMICategory(885.2928099999997d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.lang.String str1 = WeightHelper.getBMICategory(999999.9999999998d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(29.10383045673371d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.lang.String str2 = WeightHelper.getCategory(10000.0d, 23.938317582400003d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        double double2 = WeightHelper.calculateBMI(8.852928100000004E11d, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2759278760810917E-20d + "'", double2 == 1.2759278760810917E-20d);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(9.329094673600536E-10d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(9.094947017729286E-7d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.lang.String str1 = WeightHelper.getBMICategory(8.852928100000004E11d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        double double2 = WeightHelper.calculateBMI(885.2928099999997d, 1.048576d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01337907348589609d + "'", double2 == 0.01337907348589609d);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        double double2 = WeightHelper.calculateBMI(9.094947017729286E-7d, 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2089258196146281E18d + "'", double2 == 1.2089258196146281E18d);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.lang.String str2 = WeightHelper.getCategory((double) 100, (double) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.lang.String str2 = WeightHelper.getCategory(9.094947017729286E-7d, 99.99999999999999d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.lang.String str2 = WeightHelper.getCategory((double) (short) 10, 1.2759278760810917E-20d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        double double2 = WeightHelper.calculateBMI((double) (byte) 10, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9699.999999999998d + "'", double2 == 9699.999999999998d);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (-1L), 0.014005111865831029d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (byte) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (short) 0, 3274011.871301773d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.lang.String str1 = WeightHelper.getBMICategory(0.7311616000000002d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.lang.String str2 = WeightHelper.getCategory(1.0628122010840683E-5d, 100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        double double2 = WeightHelper.calculateBMI(0.01337907348589609d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.58660443368976E8d + "'", double2 == 5.58660443368976E8d);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.lang.String str2 = WeightHelper.getCategory((double) '#', 4.851129230272279E-8d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.lang.String str2 = WeightHelper.getCategory(10.0d, 97656.25d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (short) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        double double2 = WeightHelper.calculateBMI(8.852928100000003E15d, 9999.999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2759278760810915E-24d + "'", double2 == 1.2759278760810915E-24d);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        double double2 = WeightHelper.calculateBMI((double) 'a', 1.0E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0628122010840685E9d + "'", double2 == 1.0628122010840685E9d);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.lang.String str2 = WeightHelper.getCategory(9699.999999999998d, 9.329094673600543E-8d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((-1.0d), (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.lang.String str2 = WeightHelper.getCategory(32.00000000000001d, 9.999999999999999E7d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.lang.String str1 = WeightHelper.getBMICategory(1237.94003928538d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.lang.String str1 = WeightHelper.getBMICategory(36982.24852071005d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        double double2 = WeightHelper.calculateBMI(99.99999999999999d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00000000000003d + "'", double2 == 97.00000000000003d);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.lang.String str2 = WeightHelper.getCategory(1.0E9d, 29.10383045673371d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.lang.String str2 = WeightHelper.getCategory(1.0E9d, 0.01d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.lang.String str2 = WeightHelper.getCategory(3274011.871301774d, (double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.lang.String str2 = WeightHelper.getCategory(10.628122010840686d, 9999999.999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.lang.String str1 = WeightHelper.getBMICategory(23.938317582400003d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Normal weight" + "'", str1, "Normal weight");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.lang.String str1 = WeightHelper.getBMICategory(9.409000000000006E12d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        double double2 = WeightHelper.calculateBMI(1.9614315837444108E-8d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5992836296217964E21d + "'", double2 == 2.5992836296217964E21d);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        double double2 = WeightHelper.calculateBMI(97656.25d, 797.1938775510205d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.359183673469388E-4d + "'", double2 == 8.359183673469388E-4d);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.lang.String str1 = WeightHelper.getBMICategory(8.852928100000003E15d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        double double2 = WeightHelper.calculateBMI(10.628122010840686d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 885.2928099999997d + "'", double2 == 885.2928099999997d);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        double double2 = WeightHelper.calculateBMI(99.99999999999999d, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.000000000000014d + "'", double2 == 52.000000000000014d);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.lang.String str1 = WeightHelper.getBMICategory(0.01337907348589609d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        double double2 = WeightHelper.calculateBMI((double) (short) 10, 23.938317582400003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2393.83175824d + "'", double2 == 2393.83175824d);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.lang.String str1 = WeightHelper.getBMICategory(73116.16000000003d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.lang.String str1 = WeightHelper.getBMICategory(90.94947017729282d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 1.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.lang.String str2 = WeightHelper.getCategory((double) 1L, (double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((-1.0d), 99.99999999999999d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.lang.String str2 = WeightHelper.getCategory(100.0d, 10000.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.lang.String str2 = WeightHelper.getCategory(999.9999999999998d, 4.851129230272279E-8d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(99.99999999999999d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        double double2 = WeightHelper.calculateBMI(9.409000000000006E12d, 0.10628122010840686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2005205386046987E-23d + "'", double2 == 1.2005205386046987E-23d);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.lang.String str2 = WeightHelper.getCategory(9.999999999999997E10d, 90.94947017729282d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.lang.String str2 = WeightHelper.getCategory(1.2005205386046987E-23d, 1.0628122010840685E9d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.lang.String str1 = WeightHelper.getBMICategory(3274011.871301773d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.lang.String str2 = WeightHelper.getCategory(10000.0d, 97.65625d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.lang.String str1 = WeightHelper.getBMICategory(97.00000000000003d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.lang.String str2 = WeightHelper.getCategory((double) ' ', 9699.999999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.String str1 = WeightHelper.getBMICategory(1.0E8d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.lang.String str2 = WeightHelper.getCategory(3.433050271962129d, 97656.25d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) (-1.0f), 0.7311616000000002d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.lang.String str2 = WeightHelper.getCategory(10.0d, 1000000.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(97656.25d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) 0L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.lang.String str2 = WeightHelper.getCategory(2.5992836296217964E21d, 32.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(0.0d, 29.10383045673371d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        double double2 = WeightHelper.calculateBMI(1.0E9d, 1.2089258196146281E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12089.25819614628d + "'", double2 == 12089.25819614628d);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        double double2 = WeightHelper.calculateBMI(32.00000000000001d, 90.94947017729282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 888.1784197001248d + "'", double2 == 888.1784197001248d);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.lang.String str1 = WeightHelper.getBMICategory(52.000000000000014d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.lang.String str2 = WeightHelper.getCategory(9.329094673600543E-8d, 9.999999999999998E10d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.lang.String str2 = WeightHelper.getCategory(9.999999999999997E10d, (double) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.lang.String str2 = WeightHelper.getCategory(1.0E8d, 9.999999999999997E10d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        double double2 = WeightHelper.calculateBMI((double) 100L, 97.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00000000000003d + "'", double2 == 97.00000000000003d);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        double double2 = WeightHelper.calculateBMI(1000000.0d, 9.094947017729286E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.094947017729286E-15d + "'", double2 == 9.094947017729286E-15d);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.lang.String str2 = WeightHelper.getCategory(1237.94003928538d, 888.1784197001248d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        double double2 = WeightHelper.calculateBMI(0.10628122010840686d, 8.852928100000003E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.837433594376961E21d + "'", double2 == 7.837433594376961E21d);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        double double2 = WeightHelper.calculateBMI((double) '4', 9.094947017729286E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.363515908923552E-14d + "'", double2 == 3.363515908923552E-14d);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        double double2 = WeightHelper.calculateBMI(714025.0d, 90.94947017729282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.783911633305625E-6d + "'", double2 == 1.783911633305625E-6d);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.lang.String str2 = WeightHelper.getCategory((double) (short) 1, 1237.94003928538d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        double double2 = WeightHelper.calculateBMI(100.0d, 1000000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1000000.0d + "'", double2 == 1000000.0d);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        double double2 = WeightHelper.calculateBMI(36982.24852071005d, 3274011.871301775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.93831758240001d + "'", double2 == 23.93831758240001d);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.lang.String str2 = WeightHelper.getCategory(5.58660443368976E8d, 100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.String str1 = WeightHelper.getBMICategory(2.5992836296217964E21d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        double double2 = WeightHelper.calculateBMI(999.9999999999998d, 36982.24852071005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 369.82248520710056d + "'", double2 == 369.82248520710056d);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.String str2 = WeightHelper.getCategory(1.0E8d, (double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.lang.String str2 = WeightHelper.getCategory(1.2005205386046987E-23d, 5.09831700625E13d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.lang.String str2 = WeightHelper.getCategory(32.00000000000001d, 97656.25d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(10.628122010840686d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        double double2 = WeightHelper.calculateBMI(9.409000000000006E12d, 8.852928100000003E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.99999999999999E-7d + "'", double2 == 9.99999999999999E-7d);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(9.99999999999999E-7d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        double double2 = WeightHelper.calculateBMI(9.999999999999998E10d, 9.094947017729286E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.094947017729289E-33d + "'", double2 == 9.094947017729289E-33d);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        double double2 = WeightHelper.calculateBMI(9.999999999999997E10d, 885.2928099999997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.852928100000004E-16d + "'", double2 == 8.852928100000004E-16d);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        double double2 = WeightHelper.calculateBMI(23.938317582400003d, 90.94947017729282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1587.1315494962246d + "'", double2 == 1587.1315494962246d);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.lang.String str2 = WeightHelper.getCategory(369.82248520710056d, (double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        double double2 = WeightHelper.calculateBMI(1587.1315494962246d, 999.9999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.969850485520793d + "'", double2 == 3.969850485520793d);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        double double2 = WeightHelper.calculateBMI(0.10628122010840686d, 23.938317582400003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1192420439195298E7d + "'", double2 == 2.1192420439195298E7d);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(9999.999999999998d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.lang.String str2 = WeightHelper.getCategory(32.00000000000001d, 2393.83175824d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        double double2 = WeightHelper.calculateBMI((double) 10.0f, 1587.1315494962246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 158713.15494962243d + "'", double2 == 158713.15494962243d);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.lang.String str2 = WeightHelper.getCategory(10.0d, 9.999999999999997E7d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        double double2 = WeightHelper.calculateBMI((double) '#', 32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 261.2244897959185d + "'", double2 == 261.2244897959185d);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        double double2 = WeightHelper.calculateBMI(369.82248520710056d, 0.014005111865831029d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0010240000000000004d + "'", double2 == 0.0010240000000000004d);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.lang.String str2 = WeightHelper.getCategory(9.094947017729289E-33d, 104.8576d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(23.93831758240001d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        double double2 = WeightHelper.calculateBMI(8.359183673469388E-4d, 2393.83175824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4258306333626734E13d + "'", double2 == 3.4258306333626734E13d);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.lang.String str2 = WeightHelper.getCategory(1.0628122010840685E9d, 3.969850485520793d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.lang.String str1 = WeightHelper.getBMICategory(9.329094673600536E-10d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (-1L), 1237.94003928538d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        double double2 = WeightHelper.calculateBMI(2393.83175824d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017450695934812396d + "'", double2 == 0.017450695934812396d);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.lang.String str1 = WeightHelper.getBMICategory(5.09831700625E13d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(1587.1315494962246d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.lang.String str2 = WeightHelper.getCategory(9.999999999999998E10d, 158713.15494962243d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.lang.String str2 = WeightHelper.getCategory(9.094947017729289E-33d, 2393.83175824d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.lang.String str2 = WeightHelper.getCategory((double) (short) 10, (double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        double double2 = WeightHelper.calculateBMI(2.5992836296217964E21d, 9.999999999999996E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4801054466956677E-30d + "'", double2 == 1.4801054466956677E-30d);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        double double2 = WeightHelper.calculateBMI(1.2759278760810917E-20d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.142536534626867E45d + "'", double2 == 6.142536534626867E45d);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.lang.String str2 = WeightHelper.getCategory(52.000000000000014d, 9999999.999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.lang.String str2 = WeightHelper.getCategory((double) 1, 2.1192420439195298E7d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.lang.String str2 = WeightHelper.getCategory(9999999.999999998d, 3.969850485520793d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.lang.String str2 = WeightHelper.getCategory(0.01d, 3.4258306333626734E13d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        double double2 = WeightHelper.calculateBMI((double) 'a', 90.94947017729282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.66220658655843d + "'", double2 == 96.66220658655843d);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(32.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.lang.String str1 = WeightHelper.getBMICategory(3.969850485520793d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.String str1 = WeightHelper.getBMICategory(9.094947017729286E-7d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        double double2 = WeightHelper.calculateBMI(999.9999999999998d, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010000000000000004d + "'", double2 == 0.010000000000000004d);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.lang.String str1 = WeightHelper.getBMICategory(9.999999999999998E10d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI(9.094947017729289E-33d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.String str2 = WeightHelper.getCategory((double) (short) 100, 1062.8122010840682d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.lang.String str2 = WeightHelper.getCategory(2.0846334187952071E-13d, 8.852928100000003E15d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.lang.String str2 = WeightHelper.getCategory((double) 'a', 2.0846334187952071E-13d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.String str2 = WeightHelper.getCategory(1.783911633305625E-6d, 3.969850485520793d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        double double2 = WeightHelper.calculateBMI(9999999.999999998d, 97.65625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.765625000000004E-9d + "'", double2 == 9.765625000000004E-9d);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.lang.String str2 = WeightHelper.getCategory(1.048576d, 5.09831700625E13d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.lang.String str1 = WeightHelper.getBMICategory(0.017450695934812396d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        double double2 = WeightHelper.calculateBMI(714025.0d, 36982.24852071005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.253815028640569E-4d + "'", double2 == 7.253815028640569E-4d);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.lang.String str2 = WeightHelper.getCategory(9.329094673600536E-10d, (double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.lang.String str1 = WeightHelper.getBMICategory(3.363515908923552E-14d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        double double2 = WeightHelper.calculateBMI(158713.15494962243d, 97656.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.038768071147664014d + "'", double2 == 0.038768071147664014d);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(23.93831758240001d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.String str1 = WeightHelper.getBMICategory(3274011.871301775d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.lang.String str1 = WeightHelper.getBMICategory(158713.15494962243d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        double double2 = WeightHelper.calculateBMI((double) 10L, 1.783911633305625E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7839116333056247E-4d + "'", double2 == 1.7839116333056247E-4d);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.lang.String str2 = WeightHelper.getCategory((double) 1L, 9.094947017729286E-7d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.lang.String str2 = WeightHelper.getCategory(9.094947017729289E-33d, 1.048576d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory(0.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.lang.String str2 = WeightHelper.getCategory((double) 10L, 1.2759278760810915E-24d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.lang.String str1 = WeightHelper.getBMICategory(9.999999999999996E8d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        double double2 = WeightHelper.calculateBMI(1.9614315837444108E-8d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5992836296217965E19d + "'", double2 == 2.5992836296217965E19d);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        double double2 = WeightHelper.calculateBMI(1.4801054466956677E-30d, 96.66220658655843d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.412364596678692E65d + "'", double2 == 4.412364596678692E65d);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.lang.String str1 = WeightHelper.getBMICategory(9699.999999999998d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        double double2 = WeightHelper.calculateBMI(0.017450695934812396d, 52.000000000000014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.707567345305652E9d + "'", double2 == 1.707567345305652E9d);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.lang.String str2 = WeightHelper.getCategory((double) ' ', 1.2759278760810915E-24d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.lang.String str2 = WeightHelper.getCategory(1.0d, 3.969850485520793d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.lang.String str2 = WeightHelper.getCategory(9.409000000000006E12d, 0.038768071147664014d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.lang.String str2 = WeightHelper.getCategory(1.2759278760810917E-20d, 23.93831758240001d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.String str1 = WeightHelper.getBMICategory(714025.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        double double2 = WeightHelper.calculateBMI(0.0010240000000000004d, 2.1192420439195298E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.02106670753434016E17d + "'", double2 == 2.02106670753434016E17d);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        double double2 = WeightHelper.calculateBMI(1.9614315837444108E-8d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5213051207331427E21d + "'", double2 == 2.5213051207331427E21d);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        double double2 = WeightHelper.calculateBMI(1.0000000000000002d, 1.9614315837444108E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.96143158374441E-4d + "'", double2 == 1.96143158374441E-4d);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = WeightHelper.calculateBMI((double) 10L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.lang.String str2 = WeightHelper.getCategory(0.10628122010840686d, (double) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        double double2 = WeightHelper.calculateBMI((double) 10, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9999.999999999998d + "'", double2 == 9999.999999999998d);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (short) -1, 999.9999999999998d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        double double2 = WeightHelper.calculateBMI(9.99999999999999E-7d, 1062.8122010840682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0628122010840705E19d + "'", double2 == 1.0628122010840705E19d);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.lang.String str1 = WeightHelper.getBMICategory(1.0000000000000002d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        double double2 = WeightHelper.calculateBMI((double) (short) 100, 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.lang.String str1 = WeightHelper.getBMICategory(1.7839116333056247E-4d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        double double2 = WeightHelper.calculateBMI(97.00000000000003d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.628122010840677d + "'", double2 == 10.628122010840677d);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = WeightHelper.getCategory((double) (short) -1, 1.2089258196146281E18d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height and weight must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.lang.String str2 = WeightHelper.getCategory((double) 10.0f, 73116.16000000003d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        double double2 = WeightHelper.calculateBMI(32.0d, 0.017450695934812396d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1704169524884023d + "'", double2 == 0.1704169524884023d);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        double double2 = WeightHelper.calculateBMI(0.01d, 100000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E13d + "'", double2 == 1.0E13d);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        double double2 = WeightHelper.calculateBMI((double) 1, 9699.999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.699999999999997E7d + "'", double2 == 9.699999999999997E7d);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.lang.String str2 = WeightHelper.getCategory(7.837433594376961E21d, 29.10383045673371d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.lang.String str2 = WeightHelper.getCategory(0.010000000000000004d, 0.017450695934812396d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.lang.String str2 = WeightHelper.getCategory(3274011.871301774d, 9.329094673600543E-8d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        double double2 = WeightHelper.calculateBMI(9.765625000000004E-9d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.048575999999999E21d + "'", double2 == 1.048575999999999E21d);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.lang.String str2 = WeightHelper.getCategory(10000.0d, 10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.lang.String str2 = WeightHelper.getCategory((double) 100, 4.412364596678692E65d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        double double2 = WeightHelper.calculateBMI(100000.0d, 9.409000000000006E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9409000.000000006d + "'", double2 == 9409000.000000006d);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.lang.String str2 = WeightHelper.getCategory(1.048576d, 0.038768071147664014d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.lang.String str1 = WeightHelper.getBMICategory(261.2244897959185d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Obese" + "'", str1, "Obese");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.String str1 = WeightHelper.getBMICategory(0.01d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        double double2 = WeightHelper.calculateBMI((double) '#', (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.163265306122451d + "'", double2 == 8.163265306122451d);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        double double2 = WeightHelper.calculateBMI(0.10628122010840686d, 1.4801054466956677E-30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3103267100015123E-24d + "'", double2 == 1.3103267100015123E-24d);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        double double2 = WeightHelper.calculateBMI(1.0E8d, 0.010000000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000003E-14d + "'", double2 == 1.0000000000000003E-14d);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.lang.String str2 = WeightHelper.getCategory(0.01d, 1.707567345305652E9d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.lang.String str1 = WeightHelper.getBMICategory(8.163265306122451d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.lang.String str1 = WeightHelper.getBMICategory(1.0000000000000003E-14d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Underweight" + "'", str1, "Underweight");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.String str2 = WeightHelper.getCategory(1.9614315837444108E-8d, 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Obese" + "'", str2, "Obese");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.lang.String str2 = WeightHelper.getCategory(12089.25819614628d, 99.99999999999999d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Underweight" + "'", str2, "Underweight");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        double double2 = WeightHelper.calculateBMI(797.1938775510205d, 8.163265306122451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12845056d + "'", double2 == 0.12845056d);
    }
}

