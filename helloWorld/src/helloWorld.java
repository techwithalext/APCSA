import java.util.Scanner;

public class helloWorld
{
    /**
     *
     * This is a javadoc comment
     */

    public static void main(String[] args){
        //System.out.println("Hello, World!");

        //Creating a scanner object called name to grab input
        Scanner name = new Scanner(System.in);

        System.out.println("What is your name?");

        String firstName = name.nextLine();

        System.out.println("Hello, " + firstName + "!");

    }

}
