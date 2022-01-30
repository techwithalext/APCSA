import java.util.Locale;
import java.util.Scanner;
public class UnitTestMain {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String[] answerArray = new String[20];
        for(int i = 0; i < answerArray.length; i++) {
            System.out.println("Question " + (i + 1) + ": ");
            answerArray[i] = myScanner.nextLine().toUpperCase();
        }
        UnitTest UnitTest = new UnitTest(answerArray);
        System.out.println(UnitTest.toString());
        System.out.println("Correct Answers: " + UnitTest.totalCorrect());
        System.out.println("Incorrect Answers: " + UnitTest.totalMistakes());
        if(UnitTest.isPassing() == true){
            System.out.println("The student PASSED");
        }
        else if(UnitTest.isPassing() == false){
            System.out.println("The student FAILED");
        }

    }
}
