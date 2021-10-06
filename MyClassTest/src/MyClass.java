public class MyClass {

    public static void strange(int x) {
        x = x + 1;
        System.out.println("1. x = " + x);
    }


//when you return a value you can work
//with an updated value, but remember
//the original primitive does not change

    public static int doubleMyNumber(int y) {
        y = y * 2;
        return y;
    }
}