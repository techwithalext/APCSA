public class Main {

    public static void main(String[] args){

        Box userBox = new Box("Purple");
        /*
        the changeToRed method is taking a copy of the userBox object reference variable and
        updating it. Since the original userBox object reference variable and its copy point
        to the same memory address, when we update the copy, we update the common object.
        */
        Box.changeToRed(userBox);
        System.out.println(userBox.getColor());

    }

}
