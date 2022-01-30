public class Main {

    // Returns the digit value that occurs most frequently in n.
// Breaks ties by choosing the smaller value.
    public static int mostFrequentDigit(int n) {
        int[] counts = new int[10];
        while (n > 0) {
            int digit = n % 10;  // pluck off a digit and tally it
            counts[digit]++;
            n = n / 10;
        }

        // find the most frequently occurring digit
        int bestIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > counts[bestIndex]) {
                bestIndex = i;
            }
        }

        return bestIndex;
    }

    public static boolean atLeastOneOdd(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                return true;
            }
        }
        return false;
    }
        public static void main (String[]args){
            int arr[] = {1, 2, 3};
            int arr2[] = {2, 4, 6};

            System.out.println(mostFrequentDigit(669999267));
            System.out.println(atLeastOneOdd(arr));
            System.out.println(atLeastOneOdd(arr2));

        }
}

