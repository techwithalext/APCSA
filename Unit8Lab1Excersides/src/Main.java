public class Main {

    public static int sum(int matrix[][]){
        int total = 0;
        for(int c = 0; c < matrix[0].length; c++){
            for(int r = 0; r < matrix.length; r++) {
                total += matrix[r][c];
            }
        }
        return total;
    }
    public static int rowSum(int matrix[][], int row){
        int total = 0;
        for(int i = 0; i < matrix.length; i++) {
            total += matrix[row][i];
        }
        return total;
    }
    public static int colSum(int matrix[][], int col){
        int total = 0;
        for(int i = 0; i < matrix[0].length; i++) {
            total += matrix[i][col];
        }
        return total;
    }
    public static int sum2(int matrix[][]){
        int total = 0;
        for(int c = 0; c < matrix.length; c++){
                total += rowSum(matrix, c);
        }
        return total;
    }
    public static int largest(int matrix[][]){
        int largest = matrix[0][0];
        for(int c = 0; c < matrix[0].length; c++){
            for(int r = 0; r < matrix.length; r++) {
                if(matrix[r][c] > largest){
                    largest = matrix[r][c];
                }
            }
        }
        return largest;
    }
    public static int largestByRow(int matrix[][], int row){
        int largest = matrix[0][0];
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[row][i] > largest){
                largest = matrix[row][i];
            }
        }
        return largest;
    }
    public static int largest2(int matrix[][]){
        int largest = matrix[0][0];
        for(int c = 0; c < matrix.length; c++){
            if(largestByRow(matrix, c) > largest){
                largest = largestByRow(matrix, c);
            }        }
        return largest;
    }
    public static void printTranspose(int matrix[][]){
        for(int c = 0; c < matrix.length; c++){
            for(int r = 0; r < matrix[0].length; r++)
                System.out.print(matrix[r][c]+ " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("sum: " + sum(matrix));
        System.out.println("row sum: " + rowSum(matrix, 2));
        System.out.println("col sum: " + colSum(matrix, 2));
        System.out.println("sum2: " + sum2(matrix));
        System.out.println("largest: " + largest(matrix));
        System.out.println("largest by row: " + largestByRow(matrix, 2));
        System.out.println("largest2: " + largest2(matrix));
        System.out.println("printTranspose:");
        printTranspose(matrix);
    }
}
