public class problem3 {
    public static void fourHeads(){
        for(int fourHeads = 0; fourHeads < 4;){
            int random = (int)(Math.random() * (2) + 1);
            if (random == 1){
                fourHeads++;
                System.out.print("H ");
            }
            else if (random == 2){
                System.out.print("T ");
                fourHeads = 0;
            }
            if (fourHeads == 4){
                System.out.println("\nFour heads in a row!");
            }
        }
    }
    public static void main(String[] args){
        fourHeads();
    }
}
