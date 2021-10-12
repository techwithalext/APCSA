import java.util.Locale;
import java.util.Scanner;

public class MyString {

    public static void main(String[] args){

        Scanner scanString = new Scanner(System.in);
        System.out.println("Please enter a new string: ");
        String theWord = scanString.nextLine();

        int wordLength = theWord.length();
        System.out.println(wordLength);
        System.out.println(theWord.substring(wordLength - 1));
        System.out.println(theWord.indexOf("a"));
        System.out.println(theWord.toUpperCase());
    }

}
