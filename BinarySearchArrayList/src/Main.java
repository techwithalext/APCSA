import java.util.ArrayList;
class Main
{
    public static int binarySearch(ArrayList<String> arr, String x)
    {
        int l = 0, r = arr.size() - 1;
        while (l <= r)
        {
            int c = l + (r - l) / 2;
            if (arr.get(c).equals(x)) {
                return c;
            }
            if (!(arr.get(c).equals(x))) {
                l = c + 1;
            }
            else {
                r = c - 1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("book");
        arr.add("book book");
        arr.add("book book book");
        arr.add("book book book book");
        arr.add("book book book book book");

        String find = "book book book";

        int ans = binarySearch(arr, find);

        if (ans == -1) {
            System.out.println(find + " is not in this arraylist");
        }
        else {
            System.out.println(find + " is at index: " + ans);
        }
    }
}
