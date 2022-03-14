/*Name:
 * Date:
 * Purpose: To practice declaring, initializing, and traversing arrays
 */

class Main {
    public static void main(String[] args) {

        //declare a 2D int array named values
        //and initialize it to be 4 rows and 5 columns

        int[][] values = new int[4][5];

        //using a nested for loop, assign even integers in
        //row major order starting at 2
        int count = 1;
        for(int c = 0; c < 3; c++){
            for(int r = 0; r < 4; r++){
                values[c][r] = count;
                count++;
            }
        }

        //using a nested for loop, print all values in
        //row major order with one space and comma between values
        //and a new line between rows

        for(int c = 0; c < 3; c++){
            for(int r = 0; r < 4; r++){
                System.out.print(values[c][r] + ", ");
            }
            System.out.println();
        }
        System.out.println();

        //using a nested for loop, print all values in
        //column major order with one space and comma between values
        //and a new line between columns

        for(int col = 0; col < 4; col++){
            for(int row = 0; row < 3; row++)
                System.out.print(values[row][col]+ " ");
            System.out.println();
        }
        System.out.println();

        //using a nested for loop, print all values of
        //values array by row, with a line
        //between each row

        for(int c = 0; c < 3; c++){
            for(int r = 0; r < 4; r++){
                System.out.print(values[c][r] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //declare a 2D String array named seatingChart
        //and use an initializer list to include the following names
        //in column major order with 3 rows and 2 columns
        // Avani Alex Chai Keerthana Anton Josh


        String[][] seatingChart = {{"Avani", "Alex", "Chai"}, {"Keerthana", "Anton", "Josh"}};


        //using a nested for loop, print all values in
        //row major order with one space and comma between values
        //and a new line between rows

        for(int c = 0; c < 2; c++){
            for(int r = 0; r < 3; r++){
                System.out.print(seatingChart[c][r] + ", ");
            }
            System.out.println();
        }
        System.out.println();

        //using a nested for loop, print all values in
        //seatingChart in row major order with one space
        //between values and a new line between rows

        for(int c = 0; c < 2; c++){
            for(int r = 0; r < 3; r++){
                System.out.print(seatingChart[c][r] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}