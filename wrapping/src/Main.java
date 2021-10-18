public class Main {

    public static void main(String[] args){

        Integer numOne = 5;
        Integer numTwo = new Integer(10);

        System.out.println(numOne + numTwo);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        Integer maxInt = Integer.MAX_VALUE;
        //overflow error
        System.out.println(maxInt + 1);
        //overflow error
        System.out.println(maxInt + maxInt);


        //Autoboxing and unboxing
        Integer a = new Integer(5);
        int x = a.intValue(); //unboxing x = 5
        int y = a; //unboxing the easier way
        Integer b = new Integer(7); //boxing
        Integer c = 7; //autoboxing
        int z = a + x; //unboxing
        Double d = new Double(7.5); //boxing
        Double e = d.doubleValue(); //unboxing
        double f = d + 2.0; //unboxing

    }

}
