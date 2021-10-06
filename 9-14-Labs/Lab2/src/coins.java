public class coins {

    public static void main(String[] args){
        int totalCents = 137;

        int quarter = totalCents / 25;

        int dime = (totalCents % 25) / 10;

        int nickel = ((totalCents % 25) % 10) / 5;

        int penny = ((totalCents % 25) % 10) % 5;

        System.out.print("Original value: ");
        System.out.print(totalCents);
        System.out.println(" cents.");

        System.out.print("Quarters: ");
        System.out.print(quarter);
        System.out.println("");

        System.out.print("Dimes: ");
        System.out.print(dime);
        System.out.println("");

        System.out.print("Nickels: ");
        System.out.print(nickel);
        System.out.println("");

        System.out.print("Pennies: ");
        System.out.print(penny);
        System.out.println("");

    }

}
