import java.util.*;

public class Main {

    public static void main(String[] args){
        String input;
        Scanner inScanner;
        inScanner = new Scanner(System.in);
        System.out.println("Guess how many times a computer coin flip will produce heads");
        input = inScanner.nextLine();

        int heads = 0;
        int tails = 0;
        for(int i = 1; i <= 1000; i++){
            int y = (int)(Math.random()*(2)) + 1;
            if (y == 1){
                heads++;
            }
            else if (y == 2){
                tails++;
            }
            if (i == 100){
                System.out.println("At " + i + " coin flips there have been " + heads + " heads.");
            }
            if (i == 500){
                System.out.println("At " + i + " coin flips there have been " + heads + " heads.");
            }
            if (i == 1000){
                System.out.println("Finally, at " + i + " coin flips there have been " + heads + " heads.");
            }
        }
        String heads2 = Integer.toString(heads);
        if (input == heads2){
            System.out.println("Your guess of " + input + " heads was correct!");
        }
        else if (input != heads2){}
            System.out.println("Your guess of " + input + " heads was not correct.50");

    }
}
