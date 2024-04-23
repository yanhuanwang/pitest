package mutation;
public class WeightHelper {
    // public static void main(String[] args) {
    //     // Get the Class object for the Example class
    //     Class<?> exampleClass = WeightHelper.class;

    //     // Get the Package object for this class
    //     Package packageObj = exampleClass.getPackage();

    //     // Get the package name
    //     String packageName = packageObj.getName();

    //     // Print the package name
    //     System.out.println("Package name: " + packageName);
    // }
    /**
     * Calculates the Body Mass Index (BMI) based on weight and height.
     *
     * @param height Height in centimeters.
     * @param weight Weight in kilograms.
     * @return The BMI value.
     */
    public static double calculateBMI(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Height and weight must be greater than zero.");
        }
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    /**
     * Gets the BMI category based on BMI value.
     *
     * @param bmi The BMI value.
     * @return The BMI category as a string.
     */
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    /**
     * Gets the BMI category based on weight and height.
     *
     * @param height Height in centimeters.
     * @param weight Weight in kilograms.
     * @return The BMI category as a string.
     */
    public static String getCategory(double height, double weight) {
        double bmi = calculateBMI(height, weight);
        return getBMICategory(bmi);
    }
}
