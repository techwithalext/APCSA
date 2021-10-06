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

}
