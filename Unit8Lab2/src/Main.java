public class Main {
    public static void main(String[] args){
        MagicSquare s = new MagicSquare(new int[][]{{16, 3, 2, 13},{5,10,11,8},{9,6,7,12}, {4,15,14,1}});
        System.out.println(s.isMagic());
    }
}