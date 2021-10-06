public class PersonExample {
    private String name;
    private String email;
    private String phoneNumber;

    //static counter variable
    public static int personCounter = 0;

    public PersonExample(String initName, String initEmail, String initPhone){

        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
        //everytime the constructor is called to create an object the
        //personCounter will update by 1
        personCounter++;
    }
    public static void printPersonCounter(){
        System.out.println("Person counter: " + personCounter);
    }
}
