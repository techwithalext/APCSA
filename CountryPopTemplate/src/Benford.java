//This program finds the distribution of leading digits in a set
//of positive integers. The program is useful for exploring the 
//phenomenon known as Benford's Law

import java.util.Scanner;
import java.util.Arrays;

public class Benford {

    //Method to return the first digit of the given number
    public static int firstDigit(int n){
        while(n >= 10){
            n = n/10;
        }
        return n;
    }

    //Reads integers from input, computing an array of counts
    //for the occurrences of each leading digit (0 - 9)
    public static int[] countDigits(Scanner input){
        int[] count = new int[10];
        while(input.hasNextInt()){
            count[firstDigit(input.nextInt())]++;
        }
        return count;
    }

    //Returns the sum of the integers in the given array
    public static int sum(int[] data){
        int sum = 0;
        for(int i : data){
            sum += i;
        }
        return sum;
    }


    //Reports percentages for each leading digit, excluding zeros
    public static void reportResults(int[] count){
        int total = sum(count);
        for(int i = 1; i <= 9; i++){
            System.out.println(i + " = " + (double)(count[i]*100)/total + "%");
        }
    }
}