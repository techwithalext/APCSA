import java.util.Arrays;
public class stutter {

    public static int[] stutter(int[] numbers){
        // Creating a new array of the integer type that
        // will hold twice a many values as the array parameter
        int[] result = new int[2 * numbers.length];
        for(int i = 0; i<numbers.length; i++){
            result[2*i] = numbers[i];
            result[2*i + 1] = numbers[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] eli = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(stutter(eli)));
    }
}
