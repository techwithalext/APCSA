public class problem4 {

    public static int Sebastian(){
        int months = 0;
            for(int sebastiansProgress = 0; sebastiansProgress <= 95; months++){
                sebastiansProgress = sebastiansProgress + 10;
            }
        return months;
    }

    public static void main(String[] args){
        System.out.println(Sebastian() + " months");
    }

}
