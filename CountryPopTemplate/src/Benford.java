//This program finds the distribution of leading digits in a set
//of positive integers. The program is useful for exploring the 
//phenomenon known as Benford's Law

import java.util.Scanner;
import java.util.Arrays;

public class Benford {

     //Method to return the first digit of the given number
    public static int firstDigit(int n){
        while (n >= 10)
            n /= 10;

        return n;
    }

    //Reads integers from input, computing an array of counts
    //for the occurrences of each leading digit (0 - 9)
    public static int[] countDigits(Scanner input){
        = Integer.valueOf(input);

    }

    //Returns the sum of the integers in the given array
    public static int sum(int[] data){
        int sum = 0;
        for(int i = 0; i < data.length; i++){
            sum += data[i];
        }
        return sum;
    }


    //Reports percentages for each leading digit, excluding zeros
    public static void reportResults(int[] count){
        
    }

    
}