import java.util.Scanner;

public class BMICalculator {
        public static double calculateIMC(User user) {
            double height = user.getHeight();
            double weight = user.getWeight();
            double bmi = weight / (height * height);
            return bmi;
        }
    public static String getHealthStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static double calculateIMC(double weight, double height) {
        return weight / (height * height);
    }




}


