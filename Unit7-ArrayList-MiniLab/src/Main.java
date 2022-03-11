import java.util.ArrayList;
import java.util.Collections;
public class Main {

    //Write the method smallest which accepts an arraylist of integers and returns the smallest.
    //Your return type should be an integer. MUST USE a for each loop.
    public static int smallest(ArrayList<Integer> list){
        int smallest = list.get(list.size() - (list.size() - 1));
        for(Integer object : list){
            if (object < smallest){
                smallest = object;
            }
        }
        return smallest;
    }
    //Write the method longest which accepts an arraylist of strings and return the longest string.
    // MUST USE a regular for loop.
    public static String longest(ArrayList<String> list){
        int longestcount = list.get(list.size() - (list.size() - 1)).length();
        String longest = list.get(list.size() - (list.size() - 1));
        for(String object : list){
            if (object.length() < longestcount){
                longest = object;
            }
        }
        return longest;
    }
    //Write the method removeX which accepts an arraylist of Integers list and an integer variable x.
    // Remove all occurrences of x in list, and return the updated list.
    public static ArrayList<Integer> removeX(ArrayList<Integer> list, int x){
        for(int i = 0; i < list.size(); i++){
            if (list.get(i) == x){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(smallest(numbers));

        ArrayList<String> words = new ArrayList<String>();
        words.add("qwerty");
        words.add("uiopasdfg");
        words.add("abc");

        System.out.println(longest(words));

        numbers.add(10);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);

        System.out.println(removeX(numbers, 3));



    }


}
