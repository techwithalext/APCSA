import java.util.*;
public class Main {
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int pos = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(pos))
                    pos = j;
            }
            int min = arr.get(pos);
            arr.set(pos, arr.get(i));
            arr.set(i, min);
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            array.add((int)(Math.random()*20));
        }

        System.out.println(array);
        System.out.println(selectionSort(array));
    }
}