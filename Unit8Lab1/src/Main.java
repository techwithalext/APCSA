public class Main {
    public static void main(String[] args) {
    Student a = new Student("Alex", 1234);
    GradStudent b = new GradStudent("Alex", 1235, "tech tips");

    System.out.println(a.getName());
    a.printWelcome();
    System.out.println(b.getName());
    b.printWelcome();
    }
}
