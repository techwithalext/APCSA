import java.util.Scanner;

public class Mario {
    public static void buildPyramid(int height)
    {
        for (int i = 0; i < height; i++)
        {
            for (int k = height - i; k > 1; k--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height between 1 and 8: ");
        String heightString = scan.nextLine();
        int height = Integer.valueOf(heightString);
        if (height >= 1 && height <= 8){
            buildPyramid(height);
        }
        else{
            System.out.println("Number was not between 1 and 8.");
        }



    }
}
