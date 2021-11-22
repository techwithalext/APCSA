import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("BMI Calculator");
        System.out.println("Height: ");
        double height = scan.nextDouble();
        System.out.println("Weight: ");
        double weight = scan.nextDouble();
        double bmi = calculateBMI(height, weight);
        String weightClass = weightClass(bmi);
        System.out.printf("BMI: %.2f", bmi);
        System.out.println(", " + weightClass);
    }
    public static double calculateBMI(double height, double weight){
        return (weight/Math.pow(height, 2)) * 703;
    }
    public static String weightClass(double bmi){
        if (bmi < 18.5) return "Underweight";
        else if (bmi >= 18.5 && bmi <=25) return "Normal";
        else if (bmi >= 25 && bmi <= 30) return "Overweight";
        else return "Obese";
    }
}