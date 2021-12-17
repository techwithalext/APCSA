public class Main {

    public static String trim(String name){
        return name.replaceAll("\\s+"," ").trim();
    }
    public static String initials(String name){
        String trimmedName = trim(name);
        String output = trimmedName.substring(0,1);
        for(int i = 0; i < trimmedName.length(); i++){
            if(trimmedName.substring(i, i+1) .equals(" ")){
                output = output + (trimmedName.substring(i + 1, i + 2));
            }
        }
        return output.toUpperCase();
    }
    public static void main(String[] args){
        System.out.println(initials("       Eli     Jones     Calcagni"));

    }
}