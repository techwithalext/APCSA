import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void insertionSortArray(int[] elements){
        for (int i = 1; i < elements.length; i++){
            int temp = elements[i];
            int possibleIndex = i;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]){
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println(Arrays.toString(elements));
    }
    public static void insertionSortArrayList(ArrayList<Integer> elements){
        for (int i = 1; i < elements.size(); i++){
            int temp = elements.get(i);
            int possibleIndex = i;
            while (possibleIndex > 0 && temp < elements.get(possibleIndex - 1)){
                elements.set(possibleIndex, possibleIndex - 1);
                possibleIndex--;
            }
            elements.set(possibleIndex, temp);
        }
        System.out.println(elements);
    }

    public static void main(String[] args){
        int[] arr = {2, 7, 8, 4, 9, 3, 5};
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(2);
        arr2.add(7);
        arr2.add(8);
        arr2.add(4);
        arr2.add(9);
        arr2.add(3);
        arr2.add(5);

        insertionSortArray(arr);
        insertionSortArrayList(arr2);


    }
}
