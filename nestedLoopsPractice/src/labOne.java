public class labOne {
    public static void printLadder(int x){
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("1");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        printLadder(10);
    }
}
