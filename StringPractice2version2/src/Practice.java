import java.util.Scanner;
public class Practice
{
    public static String scroll(String a){
        String temp = a.substring(1, a.length());
        temp = temp + a.substring(0,1);
        return temp;
    }

    public static void main(String[] args){
        Scanner scanString = new Scanner(System.in);
        System.out.println("Please enter a new string to be scrolled: ");
        String name = scanString.nextLine();
        name = Practice.scroll(name);
        System.out.println(name);
    }
}