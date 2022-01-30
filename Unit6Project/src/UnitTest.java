public class UnitTest {
    private String[] answerKey = {"B", "D", "C", "A", "E", "A", "B", "A", "E", "B", "B", "E", "E", "D", "D", "A", "C", "C", "A", "E"};
    private String[] studentAns = new String[20];

    public UnitTest(String theStudentAns[]){
        for(int i = 0; i < theStudentAns.length; i++){
            studentAns[i] = theStudentAns[i].toUpperCase();
        }
    }

    public String[] getStudentAns(){
        return studentAns;
    }
    public int totalCorrect() {
        int correct = 0;
        for (int i = 0; i < answerKey.length; i++) {
            if(studentAns[i].equals(answerKey[i])){
                correct++;
            }
        }
        return correct;
    }
    public int totalMistakes() {
        int mistakes = 0;
        for (int i = 0; i < answerKey.length; i++) {
            if(!studentAns[i].equals(answerKey[i])){
                mistakes++;
            }
        }
        return mistakes;
    }
    public boolean isPassing(){
        if(totalCorrect() < 14){
            return false;
        }
            return true;
    }
    public String toString(){
        String header = "ANSWER KEY\t Studnet's Answers\n";
        String output = "";
        for(int i = 0; i < answerKey.length; i++){
            output += (i + 1) + ") " + answerKey[i] + "\t" + (i + 1) + ") " + studentAns[i] + "\t\n";
        }
        return header + output;
    }
}
