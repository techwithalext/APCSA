public class Strings {

    /*
    A credit card number is represented as a String ccNumber that contains four groups of four digits. The groups are separated by one space.
    For example: String ccNumber = "4111 1111 1111 1111";

        a) Write a statement that declares a string last4 and sets it to the last four digits ccNumber

        b) Write a statement that sets String last5 to a string that holds the last five digits in ccNumber
    */

    public static void main(String[] args){

        String ccNumber = "4111 1111 1113 6547";
        String lastFour = ccNumber.substring(15);
        String lastFive = ccNumber.substring(13, 14) + lastFour ;
        System.out.println("CC Number: " + ccNumber);
        System.out.println("Last Four: " + lastFour);
        System.out.println("Last Five: " + lastFive);

    }
}
