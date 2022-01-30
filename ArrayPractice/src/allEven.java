public class allEven {

    public static boolean ifEven(int[] nums){
        for(int x : nums){
        if (x%2 == 1){
            return false;
        }
        }
        return true;
    }

}
