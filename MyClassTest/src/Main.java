public class Main {

    public static void main(String[] args){

        int x = 23; //primitive

        //calling the method on a primitive
        MyClass.strange(x); // 24 - copy was updated
        System.out.println("2. x = " + x); // 23 - original primitive was not updated

        int y = 5;
        MyClass.doubleMyNumber(y); //10
        System.out.println(y); //5 - original primitive
        //creating a new variable to store return value - original primitive was not updated
        int z = MyClass.doubleMyNumber(y);
        System.out.println("My number is " + z); //10
    }

}
