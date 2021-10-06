public class Circle {

    private int radius;
    private double area;

    public Circle(int myRadius){

        radius = myRadius;

    }


    public double computeArea(){

        return 3.14 * (radius * radius);
    }
}
