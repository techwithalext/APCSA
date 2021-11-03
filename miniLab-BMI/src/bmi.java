public class bmi {

    public static double bmi (double height, double weight){
        System.out.println();
        return (weight/Math.pow(height,2))*703;
    }

    public static String weightClass(double height, double weight){

        if (bmi(height, weight) < 18.5){
            return "Underweight";
        }
        else if (bmi(height, weight) < 25){
            return "Normal";
        }
        else if (bmi(height, weight) < 30){
            return "Overweight";
        }
        else if (bmi(height, weight) >= 30){
            return "Obese";
        }
        return "error";
    }
}
