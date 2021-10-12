public class twoSevenNine {
    public static void main(String[] args) {
        String s1 = new String("hi there");
        int pos = s1.indexOf("e");
        String s2 = s1.substring(0, pos);
        System.out.println(s2);
    }
}
