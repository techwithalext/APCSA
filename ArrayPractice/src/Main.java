public class Main {
    /*
    Write the method average which accepts an int array and
    returns the average of the values.
    */
    public static double average(int[] array){
        int all = 0;
        for(int i = 0; i <= array.length; i++) {
            all += array[i];
        }
        return all/array.length;
    }

    /*
    Write the method countAboveAve which accepts an int array and
    returns the number of values that are above the average. You
    must call average.
    */
    public static int countAboveAve(int[] array){
        int count = 0;
        for(int i = 0; i< array.length; i++){
            if (average(array) < array [ i]){
                count++;
            }
        }
        return count;

    }

    /*
    Write the method largest which accepts an int array and returns the
    largest value of the array.
    */
    public static int largest(int[] array){
        int largest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }

    /*
    Write the method indexOfsmallest which accepts an int array and returns
    the index of the smallest value. If there are multiple smallest values,
    'return the index of the first one.

    public static int indexOfsmallest(int[] array){
    }
        */


    public static void main(String[] args){
        int[] numbers = new int [5];
        numbers[0] = ((int)(Math.random()*100) - 1);
        numbers[1] = ((int)(Math.random()*100) - 1);
        numbers[2] = ((int)(Math.random()*100) - 1);
        numbers[3] = ((int)(Math.random()*100) - 1);
        numbers[4] = ((int)(Math.random()*100) - 1);

        int i = 0;
        System.out.println("while loop");
        while (i < 5){
            System.out.println(numbers[i]);
            i++;
        }
        System.out.println();
        System.out.println("for loop");
        for(int y = 0; y < 5; y++){
            System.out.println(numbers[y]);
        }
        System.out.println();
        System.out.println("for loop with numbers.length");
        for(int z = numbers.length; z < 5; z++){
            System.out.println(numbers[z]);
        }


    }
}
