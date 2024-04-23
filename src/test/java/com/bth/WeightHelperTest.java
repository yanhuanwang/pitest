package com.bth;

import org.junit.Test;

import mutation.WeightHelper;

import static org.junit.Assert.*;

public class WeightHelperTest {
    @Test
    public void testCalculateBMICorrectly() {
        // Valid input
        double height = 170; // in centimeters
        double weight = 70;  // in kilograms
        double expectedBMI = 24.22; // approximate value
        double actualBMI = WeightHelper.calculateBMI(height, weight);

        assertEquals("BMI calculation is incorrect", expectedBMI, actualBMI, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateBMIWithZeroHeight() {
        WeightHelper.calculateBMI(0, 70);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateBMIWithZeroWeight() {
        WeightHelper.calculateBMI(170, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateBMIWithNegativeHeight() {
        WeightHelper.calculateBMI(-170, 70);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateBMIWithNegativeWeight() {
        WeightHelper.calculateBMI(170, -70);
    }

    @Test
    public void testGetBMICategory() {
        assertEquals("Underweight", WeightHelper.getBMICategory(17.0));
        assertEquals("Normal weight", WeightHelper.getBMICategory(22.0));
        assertEquals("Overweight", WeightHelper.getBMICategory(26.0));
        assertEquals("Obese", WeightHelper.getBMICategory(31.0));
    }

    @Test
    public void testGetCategory() {
        assertEquals("Underweight", WeightHelper.getCategory(180, 55));
        assertEquals("Normal weight", WeightHelper.getCategory(170, 65));
        assertEquals("Overweight", WeightHelper.getCategory(165, 75));
        assertEquals("Obese", WeightHelper.getCategory(160, 80));
    }
}
