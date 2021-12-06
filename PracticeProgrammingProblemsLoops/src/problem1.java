public class problem1 {
    public static int addOdds(int n){
        int x = 0;
        for(int i = 1; i <= n; i++){
            if (i % 2 != 0){
                x = x + i;
            }
        }
        return x;
    }
    public static void main(String[] args){

        System.out.println(addOdds(10));

    }
}
