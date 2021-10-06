public class Main {

    public static void main(String[] args) {
        myRectangle rectangle1 = new myRectangle(15, 20);
        myRectangle rectangle2 = new myRectangle(20, 40);

        int myRectangle1Length = rectangle1.getLength();
        int myRectangle2Length = rectangle2.getLength();
        /*
        What prints is different because this method is called on
        different objects, takes no parameters, but returns a
        different result depending on the object it is called on.
        */
        System.out.println(myRectangle1Length);
        System.out.println(myRectangle2Length);

    }
}
