public class problem2 {

    public static void mexico(double targetPopulation) {
        int startingYear = 2014;
        double startingPopulation = 123.8;
        double growthRate = 0.5;

        System.out.println();
        while (startingPopulation < targetPopulation) {
            startingYear++;
            startingPopulation += growthRate * startingPopulation;
        }
        System.out.println("target population number: " + startingYear);

    }

    public static void main(String[] args) {
        mexico(200);
    }
}
