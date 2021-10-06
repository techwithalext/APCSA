public class Main {
    public static void main(String[] args){
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


    }

}
