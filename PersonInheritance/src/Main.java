public class Main {
    public static void main(String[] args){
        Person p = new Person("Tyler");
        System.out.println(p.getName());
        Employee emp = new Employee("Chai", 123);
        /*
        we can access the getter method of the superclass
        in the subclass which is why this works
        */
        System.out.println(emp.getName());

        //this works because every Employee is a Person
        Person p2 = new Employee ("Priya", 456);
        //this won't work because not every Person is an Employee
        // Employee emp2 = new Person("Abbey");

    }
}
