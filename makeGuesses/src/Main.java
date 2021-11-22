public class Main {

    /*
    Write a method called makeGuesses that computes random numbers between 1 and 50,
    inclusive. The method should use a while loop, report each guess, and also return
    the number of guesses made before a 48 is found. A sample execution might look like:
    guess = 43 guess = 22 guess = 48
    guess = 47 guess = 19 guess = 5
     */

    public static void makeGuesses(){
        int ans = 0;
        int guesses = 0;
        while (ans != 48) {
                ans = (int) (Math.random() * 50) + 1;
                System.out.print(ans + " ");
                guesses++;
            }
        System.out.println();
        if (guesses > 1)
            System.out.println("It took " + guesses + " guesses.");
        if (guesses == 1)
            System.out.println("It took " + guesses + " guess.");
    }
    public static void main(String[] args){
        makeGuesses();
    }
}
