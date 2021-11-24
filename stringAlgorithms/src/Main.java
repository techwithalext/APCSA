public class Main {

    public static String numOfWords(String str){
        while(str.indexOf(" ") != 1) {
            int indexSpace = str.indexOf(" ");
            String first = str.substring(0, indexSpace);
            String second = str.substring(indexSpace + 1);
            str = first + second;
        }
        return str;
    }

    public static String removeSpaces2(String phrase){
        String noSpaces = "";
        int length = phrase.length();

        for(int i = 0; i < length; i++){
            if(!phrase.substring(i, i+1).equals(" ")){
                noSpaces = noSpaces + phrase.substring(i, i+1);
            }
        }
    }

    public static void main(String[] args){

        /*Code to be written*/
    }


}
