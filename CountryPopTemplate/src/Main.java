import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

class Main {
  public static void main(String[] args) 

      //indicates that this method can throw FileNotFoundException if a file is not found
      //like if the user types a file name that doesn't exist
      throws FileNotFoundException {
    
    //creating a Scanner object to take user input
    Scanner console = new Scanner(System.in);
    
    System.out.println("Let's count these leading digits...");
    System.out.print("input file name? ");
    
    //creating a string name to hold the name of the file the user types
    String name = console.nextLine();
    
    //creating a Scanner object input to hold the contents of the name file
    Scanner input = new Scanner(new File(name));

    //calling the countDigits method we created with our input object as the parameter
    //and storing the results in an array called count
    int[] count = Benford.countDigits(input);

    //calling the reportResults method we created on our array of counts
    System.out.println();

        //Benford.reportResults(count);
      }
  }
