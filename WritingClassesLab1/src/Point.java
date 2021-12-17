public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int newX, int newY) {
        x = newX;
        y = newY;
    }
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }
    public double distanceToOrigin(){
        return Math.sqrt(x*x+y*y);
    }
    public String toString(){
        return this.x + ", " + this.y;
    }
}