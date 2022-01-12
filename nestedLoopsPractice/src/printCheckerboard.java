public class printCheckerboard {
    public static void printCheckerboard(int row, int col) {

        int y = col;

        while (row <= 8) {

            while (y <= 8) {
                if ((row % 2) == (y % 2))
                    System.out.print("#");
                else
                    System.out.print("o");
                y++;
            }
            row++;
            y = col;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printCheckerboard(4, 5);
    }
}
