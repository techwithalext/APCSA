import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter 10-digit ISBN number: ");

        String stringISBN = myScanner.nextLine();  // Read user input
        char[] charISBN = {stringISBN.charAt(1), stringISBN.charAt(2), stringISBN.charAt(3), stringISBN.charAt(4), stringISBN.charAt(5), stringISBN.charAt(6), stringISBN.charAt(7), stringISBN.charAt(8), stringISBN.charAt(9), stringISBN.charAt(10)};
        int[] intISBN = Integer.valueOf(charISBN[]);
        System.out.println("Username is: " + userName);  // Output user input
    }
}
