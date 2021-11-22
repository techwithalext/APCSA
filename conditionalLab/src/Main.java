class Main {
    public static void main(String[] args) {
        // create enough test cases for each method to ensure that
        // your methods work properly.
        System.out.println(lucky7(7, 14)); // should print true, add more cases below
        System.out.println(mult35(5));
        System.out.println(mult35(7));
        System.out.println(mult35(10));
        System.out.println(blackjack(20,17));
        System.out.println(blackjack(56,43));
        System.out.println(enoughBricks(10,2,20));

    }
// Write the method lucky7 which accepts two integers and returns
// if either one is 7 or if their sum or difference is 7
    public static boolean lucky7(int a, int b){
        if (a == 7 || b == 7){
            return true;
        }
        else if (a + b == 7){
            return true;
        }
        else if (Math.abs(a-b) == 7){
            return true;
        }
        else {
            return false;
        }
    }

// Write the method mult35 which accepts an non-negative integer and returns if
// it is a multiple of 3 or 5 but not both.

    public static boolean mult35(int a){
        if (a % 3 == 0 && a % 5 == 0){
            return false;
        }
        else if (a % 3 == 0 || a % 5 == 0){
            return true;
        }
        else{
            return false;
        }

    }

  /* Write the method blackjack which takes two positive integers representing
     two hands in blackjack. The method returns whichever hand is closer to 21 without
     going over. If they both go over, return 0. */

    public static int blackjack(int a, int b){
        if (a > 21 && b > 21){
            return 0;
        }
        else if (Math.abs(a - 21) > Math.abs(b - 21)){
            return b;
        }
        else if (Math.abs(b - 21) > Math.abs(a - 21)) {
            return a;
        }
        else{
            return 0;
        }
    }

    /* We want to make a row of bricks that is goal inches long. We have a number of small bricks
    (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal    by choosing from the given bricks. Write a method called enoughBricks which accepts
     two integers for the number of small and big bricks and an integer for the goal that
     returns whether it is possible to make the goal from the given bricks.  */
    public static boolean enoughBricks(int small, int big, int goal){
        if ((small + big * 5) == goal){
            return true;
        }
        else{
            return false;
        }
    }
    }