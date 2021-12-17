public class Circle {
    private int x;
    private int y;
    private double radius;
    public Circle() {
        x = 0;
        y = 0;
        radius = 0.0;
    }
    public Circle(int newX, int newY, double newRadius) {
        x = newX;
        y = newY;
        radius = newRadius;
    }
    public double getArea(){
        return Math.sqrt(x*x+y*y);
    }
    public boolean isInCircle(double a, double b){
        return Math.sqrt(((square(this.x-a))+(square(this.y-b)))) <= this.radius;
    }
    private double square(double x){
        return x * x;
    }
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }
    public void tripleTheRadius(){

    }
}