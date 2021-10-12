public class Main {
    public static void main(String[] args) {
        String word = "Create";
        int wordLength = word.length();
        //getting the length of our word and storing it in a variable
        System.out.println(wordLength);
        //figures out the last index
        System.out.println(wordLength - 1);
        //using substring to get at the last character
        System.out.println(word.substring(word.length() - 1));

        //String concatenation
        System.out.println("hello" + 42);
        System.out.println(1 + "abc" + 2);
        System.out.println("abc + 1 + 2");
        System.out.println("abc" + 9 * 3);
        System.out.println("1" + 1);
        System.out.println(4 - 1 + "abc");
        //things inside parenthesis are isolated and evaluated first
        System.out.println("Grade: " + (95.1 + 71.9) / 2);

        System.out.println();

        /*
        Substring lets you extract certain characters
        the end number is NOT inclusive, meaning
        you want the substring up UNITL that second
        index referenced in the string parameters,
        but not including .
        */
        System.out.println(word.substring(1, 4));


        /*
        When you only indicate one number as a
        parameter of substring, it will start
        at that index and take all letters
        after it too
        */
        System.out.println(word.substring(3));
        System.out.println();

        /*
        indexOf lets you se if a character exists
        in the word nad which index it is in. If
        the character does not exist in the word,
        indexOf will return -1
        */
        System.out.println(word.indexOf("x"));
        System.out.println(word.indexOf("t"));

        System.out.println();

        //creating a new string
        String newWord = "java";

        /*
        Comparing the first string with the new string
        Equals is not checking to see if the strings
        refer to the same object, but to see if they
        contain the same characters. So two different
        objects with the same letters return true.
        */

        System.out.println(word.equals(newWord));
        System.out.println(word.equals("create"));


        /*
        compareTo lets you determine lexographically
        if a string is less than another one
        Returns a value if < 0 is the first word
        comes before the second, a 0 if the words
        contain the same characters in the same order
        and a value > 0 is the first word comes later
        in the alphabet. Note: All digits precede
        capital letters, and capital letter precede
        lowercase letters, just like the ASCII chart!
        */

        System.out.println(word.compareTo(newWord)); // <0
        System.out.println(word.compareTo("create")); // 0

        String myNewString = word.substring(4, 5) + word.substring(2, 3) + word.substring(3, 4) + word.substring(1, 2);
        System.out.println(myNewString);

        String myOtherNewString = "school";
        myOtherNewString = myOtherNewString.substring(0, 3);


        /*
        When the operator == is used with object variables
        it returns true when the two variables refer to
        te same object. These variables are called aliases
        for the same object and object references.
        */

        String a = "hi";
        String b = "hi";

        /*
        When variables are set ot the same string literal
        the Java runtime will check to see if the string
        literal already exists as an object in memory, and
        if so, reuse it. So a and b wll refer to the same
        string object
        */

        System.out.println(a == b);
        //creating a new string and setting it equal to another string
        String c = b;
        System.out.println(b == c);

        /*
        However, if you use the new "keyword" to
        create a string, it will create a new
        String object. So, even if we create two
        string objects with the same characters
        using the new operator, Java will not let
        them refer to the same object.
        */

        String j = new String("hi");
        String k = new String ("hi");
        System.out.println(j == k); //false


    }
}
