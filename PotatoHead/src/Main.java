public class Main {
    public static void main(String[] args) {

        //Create objects of the PotatoHead class datatype
        //Use the "new" keyword to call the constructor and initialize the object
        //The order of your attributes MUST correspond to the order of the
        //parameters in your constructor


        PotatoHead nicholas = new PotatoHead(15, "baseball hat", "green");
        PotatoHead rocky = new PotatoHead(17, "helmet", "brown");
        PotatoHead eddie = new PotatoHead(14, "top hat", "blue");
        PotatoHead jack = new PotatoHead(16, "blond", "clear");
        System.out.println(nicholas.getHat());
        System.out.println(rocky.getAge());
        System.out.println(eddie.getEyes());

        // rocky.age() = 16;
        System.out.println(jack.getHat());
        System.out.println(rocky.getAge());

        rocky.setAge(16);
        System.out.println(rocky.getAge());

        double ageAverage = PotatoHead.averageTheirAges(rocky.getAge(), nicholas.getAge(), eddie.getAge());
        System.out.println(ageAverage);

        System.out.println();
        PotatoHead.objectFriends();
    }
}