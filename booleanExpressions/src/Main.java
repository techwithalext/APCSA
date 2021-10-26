public class Main {

    public static boolean myTest(){
        boolean test = 3 < 5;
        if (test) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean otherTest(){
        boolean test = 3 < 5;
        return test;
    }

    public static void main(String[] args) {
        System.out.println(myTest());
        System.out.println(otherTest());
        System.out.println();

        int x = 2;
        int y = 3;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(2 + 4 * 3 <= 15);
        System.out.println(x > 5);
        System.out.println(y >= 3);


        int percent = 50;
        if(percent >= 90){
            System.out.println("You got an A!");
        }
        else if(percent >= 80){
            System.out.println("You got a B!");
        }
        else if(percent >= 70){
            System.out.println("You got a C!");
        }
        else if(percent >= 60){
            System.out.println("You got a D!");
        }
        else{
            System.out.println("You got an F :(");
        }
    }
}
