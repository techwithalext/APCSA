public class statistics {

    public static void main(String[] args){

        int grade1 = 98;
        int grade2 = 91;
        int grade3 = 88;
        int gradeSum = grade1 + grade2 + grade3;
        double gradeAverage = (double) gradeSum/3;

        System.out.print("The average grade is: ");
        System.out.printf("%.2f", gradeAverage);
        System.out.println(".");

        double difference1 = Math.pow((grade1 - gradeAverage),2);
        double difference2 = Math.pow((grade2 - gradeAverage),2);
        double difference3 = Math.pow((grade3 - gradeAverage),2);
        double variance = difference1 + difference2 + difference3;
        double standardDeviation = Math.sqrt(variance);

        boolean eliIsCool = true;

        System.out.print("Variance: ");
        System.out.printf("%.2f", variance);
        System.out.println("");

        System.out.print("Standard Deviation: ");
        System.out.printf("%.2f", standardDeviation);
        System.out.println("");

    }


}
