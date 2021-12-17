public class Main {
    public static void main(String[] args){
        Point beep = new Point(1,2);
        Circle circle1 = new Circle(1, 2, 3.0);
        System.out.println(beep.distanceToOrigin());
        System.out.println(beep.toString());
    }
}
