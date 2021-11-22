import java.util.Scanner;
public class Main {

    /*
        Write a program that implements a game of Rock, Paper, Scissors
        in which a user plays against the computer
    */

    public static void main(String[] args){
        System.out.println("Let's play Rock Paper Scissors!");
        System.out.println("Type 'r' for rock, 'p' for paper, or 's' for scissors.");

        Scanner scan = new Scanner(System.in);

        char user = scan.next().charAt(0);
        int computer = (int)(Math.random() * 3) + 1;

        scan.close();

        if (user == 'r'){
            if (computer == 1){
                System.out.println("Rock. We tied!");
            }
            else if (computer == 2){
                System.out.println("Paper. I won!");
            }
            else if (computer == 3){
                System.out.println("Scissors. You won!");
            }
        }
        else if (user == 'p'){
            if (computer == 1){
                System.out.println("Rock. You won!");
            }
            else if (computer == 2){
                System.out.println("Paper. We tied!");
            }
            else if (computer == 3){
                System.out.println("Scissors. I won!");
            }
        }
        else if (user == 's'){
            if (computer == 1){
                System.out.println("Rock. I won!");
            }
            else if (computer == 2){
                System.out.println("Paper. You won!");
            }
            else if (computer == 3){
                System.out.println("Scissors. We tied!");
            }
        }
        else{
            System.out.println("Unknown input. Please try again.");
        }

    }


}
