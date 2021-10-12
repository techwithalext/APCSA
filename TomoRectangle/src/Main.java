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

        int myRectangle1Area = rectangle1.computeAreaRectangle();
        int myRectangle2Area = rectangle2.computeAreaRectangle();

        System.out.println(myRectangle1Area);
        System.out.println(myRectangle2Area);

        /*
        Again, to reiterate, the method returns different
        results as it is called on different objects
        */
        myRectangle.whichAreaLarger(250, 100);

        int myRectangle1Volume = rectangle1.volumeIfRectangle3D(15);
        int myRectangle2Volume = rectangle2.volumeIfRectangle3D(15);

        System.out.println(myRectangle1Volume);
        System.out.println(myRectangle2Volume);

        int myRectangle1Perimeter = rectangle1.getPerimiter();
        int myRectangle2Perimeter = rectangle1.getPerimiter();

        System.out.println(myRectangle1Perimeter);
        System.out.println(myRectangle2Perimeter);

    }
}
