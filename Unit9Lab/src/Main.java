import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<LinuxDistro> listOfDistros = new ArrayList<LinuxDistro>();
        LinuxDistro one = new LinuxDistro("apt", true);
        LinuxDistro two = new Debian("apt", true, "13", "x64");
        LinuxDistro three = new Ubuntu("apt", true, "20.04", "x64", "Gnome", true);
        LinuxDistro four = new Ubuntu("apt", true, "21.10", "ARM", "Gnome", false);
        LinuxDistro five = new Ubuntu("apt", true, "20.04", "x64", "none, server", true);
        LinuxDistro six = one;
        LinuxDistro seven = two;
        LinuxDistro eight = three;
        LinuxDistro nine = four;
        LinuxDistro ten = five;

        System.out.println(one.toString());
        System.out.println(one.equals(six));
        System.out.println(one.amIStable());
        System.out.println(one.whatIsLinux());
        System.out.println();
        System.out.println(two.toString());
        System.out.println(two.equals(eight));
        System.out.println(((Debian) two).architecture());
        System.out.println(((Debian) two).getVersion());
        System.out.println(((Debian) two).stability());
        System.out.println();
        System.out.println(three.toString());
        System.out.println(three.equals(eight));
        System.out.println(((Ubuntu) three).stability());
        System.out.println(((Ubuntu) three).release());
        System.out.println(((Ubuntu) three).otherDistros());


    }
}
