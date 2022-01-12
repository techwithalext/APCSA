public class Main {
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
