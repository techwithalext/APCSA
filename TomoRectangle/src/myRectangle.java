public class myRectangle {
    //instance variables
    private int length;
    private int width;
    public myRectangle(int itsLength, int itsWidth){

        length = itsLength;
        width = itsWidth;

    }


    //getter methods
    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    /*
    The reason why these methods are truly non-static is
    that it returns different result depending on the
    object it's called on
    */

    //nonstatic method to compute area of a rectangle object:
    public int computeAreaRectangle(){
        return length*width;
    }

    public static void whichAreaLarger(int area1, int area2){
        if (area1 > area2) {
            System.out.println("Area1 is bigger than Area2!");
        }
        else if (area1 == area2){
            System.out.println("Area1 and Area2 are the same!");
        }
        else {
            System.out.println("Area1 is smaller than Area2!");
        }
    }

    /*
    a parameter that is fed into a nonstatic method
    is typically manipulated with the instance variables
    of the object that it has access to
    */

    public int volumeIfRectangle3D(int height){

        return length*width*height;
    }

    public int getPerimiter(){
        return (length * width) * 2;
    }

    public static myRectangle theBiggerRectangle(myRectangle rectangle1, myRectangle rectangle2){
        int areaOfRectangle1 = rectangle1.computeAreaRectangle();
        int areaOfRectangle2 = rectangle2.computeAreaRectangle();
        if (areaOfRectangle1 > areaOfRectangle2){
            return rectangle1;
        }
    }
}
