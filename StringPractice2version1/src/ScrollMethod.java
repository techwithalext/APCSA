public class ScrollMethod {
    private String word;
    /*
    just take substring 0,1 of it, make a temp string that equals substring 1,stringlength, then add the substring of 0,1 to the end, then set the original string to the tempstring
    */
    public String Scroll(String theWord){

    word = theWord;
    word = word.substring(0,1);
    String tempString = word.substring(1,stringLength) + word.substring(0,1);
    word = tempString;
    return word;


    }

    public static void main(String[] args){

    String word;

    }
}
