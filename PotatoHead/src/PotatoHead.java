public class PotatoHead{

    //declaring instance variables or attributes -> like the traits of your objects
    private String hat;
    private String eyes;
    private int age;

    //private protects attributes, access modifiers

    //formal parameters
    public PotatoHead(int hisAge, String hisHat, String hisEyes){

        //instnace are now initialized and ready to be used by objects
        hat = hisHat;
        eyes = hisEyes;
        age = hisAge;

    }

    public String getHat(){
        return hat;
    }

    public String getEyes(){
        return eyes;
    }

    public int getAge(){
        return age;
    }

    //setter method
    public void setAge(int newAge){

        age = newAge;

    }
    public static double averageTheirAges(int age1, int age2, int age3){

        return (double)(age1+age2+age3);

    }
    public static void objectFriends() {
    }


}