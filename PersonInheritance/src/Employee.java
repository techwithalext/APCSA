//subclass
public class Employee extends Person{

    private int id;

    /*
    a subclass cannot directly access a private instance
    variable of the superclass, so we have to use a call
    to the super constructor, on the FIRST line of the
    subclass constructor
     */

    public Employee(String name, int id){
        super(name); //call the super constructor, has to be first line of subclass constructor
        this.id = id;
    }
}
