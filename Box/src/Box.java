public class Box {

    //instance variable
    private String color;

    //constructor
    public Box(String boxColor){
        color = boxColor;
    }

    public String getColor(){
        return color;
    }

    /*
    I used a static method because regardless of the object
    passed in, its color will always change to red. There is
    only that "red" possibility for the whole class of objects.
    The method is taking a Box object as a parameter.
    */
    public static void changeToRed(Box boxToChange){
        System.out.println(boxToChange.color);
        boxToChange.color = "Red";
        System.out.println(boxToChange.color);
    }

}
