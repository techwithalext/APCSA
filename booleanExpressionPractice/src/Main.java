public class Main {
    public static int max1(int x, int y, int z){
        return Math.max(z,(Math.max(x, y)));
    }

    public static int max2(int x, int y, int z){
        if(x > y && x > z){
            return x;
        }
        if(y > x && y > z){
            return y;
        }
        if(z > x && z > y){
            return z;
        }
        return 0;
    }

    public static boolean perfectSquare(int n){
        return n > 0 && (Math.pow(Math.round(Math.sqrt(n)), 2)) == n;
    }

    public static String EightBall() {
        int random = (int)(Math.random() * 8) + 1;

        if(random == 1){
             return "It is certain.";
        }
        if(random == 2){
            return "Without a doubt.";
        }
        if(random == 3){
            return "As I see it, yes.";
        }
        if(random == 4){
            return "Most likely.";
        }
        if(random == 5){
            return "Reply hazy, try again.";
        }
        if(random == 6){
            return "Ask again later.";
        }
        if(random == 7){
            return "Don't count on it.";
        }
        if(random == 8){
            return "My reply is no.";
        }

        return "oops";


    }

    public static void main(String[] args){

        System.out.println(max1(1, 5, 4));
        System.out.println(max2(1, 5, 4));
        System.out.println(perfectSquare(5));
        System.out.println(EightBall());

    }
}
