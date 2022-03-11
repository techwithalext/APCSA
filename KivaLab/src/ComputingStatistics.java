import java.util.ArrayList;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }
   public double avgLoan() {
      double amount = 0.0;
      for (int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount / data.size();
   }
   public double largestLoan() {
      double largest = data.get(0).getLoanAmount();
      for (int i = 1; i < data.size(); i++) {
         if (data.get(i).getLoanAmount() > largest){
            largest = data.get(i).getLoanAmount();
         }
      }
      return largest;
   }
   public double smallestLoan() {
      double smallest = data.get(0).getLoanAmount();
      for (int i = 1; i < data.size(); i++) {
         if (data.get(i).getLoanAmount() < smallest){
            smallest = data.get(i).getLoanAmount();
         }
      }
      return smallest;
   }
   public String largestLoanCountry() {
      Loan largest = data.get(0);
      for (int i = 1; i < data.size(); i++) {
         if (data.get(i).getLoanAmount() > largest.getLoanAmount()) {
            largest = data.get(i);
         }
      }
      return largest.getCountry();
   }
   public String smallestLoanCountry() {
      Loan smallest = data.get(0);
      for (int i = 1; i < data.size(); i++) {
         if (data.get(i).getLoanAmount() < smallest.getLoanAmount()) {
            smallest = data.get(i);
         }
      }
      return smallest.getCountry();
   }
   public double avgDaysToFund(){
      double sum = 0;
      for (Loan i: data) sum += i.getDaysToFund();
      return sum / data.size();
   }

   public double largestLoanKenya(){
      double max = data.get(0).getLoanAmount();
      for (Loan i: data) if (i.getLoanAmount() > max && i.getCountry().equals("Kenya")) if (i.getLoanAmount() > max)
         max = i.getLoanAmount();
      return max;
   }
   public double avgLoanPhilippines(){
      double sumLoan = 0;
      double numLoan = 0;
      for (Loan i: data) if (i.getCountry().equals("Philippines")){
         sumLoan += i.getLoanAmount();
         numLoan++;
      }
      return sumLoan / numLoan;
   }
   public String longestToFundCountry(){
      Loan largest = data.get(0);
      for (int i = 1; i < data.size(); i++) {
         if (data.get(i).getDaysToFund() > largest.getDaysToFund()) {
            largest = data.get(i);
         }
      }
      return largest.getCountry();
   }
   public String mostLoansFunded(){
      Loan largest = data.get(0);
      for (int i = 1; i < data.size(); i++) {
         if (data.get(i).getNumLenders() > largest.getNumLenders()) {
            largest = data.get(i);
         }
      }
      return largest.getCountry();
   }
   public double variance(){
      double total = 0;
      int observations = 0;
      for(int i = 0; i < data.size(); i++){
         total += data.get(i).getLoanAmount();
         observations++;
      }
      double mean = total/observations;
      double differences = 0;
      for(int i = 0; i < data.size(); i++){
         differences += Math.pow((data.get(i).getLoanAmount() - mean),2);
      }
      return differences/(observations - 1);
   }
   public double mean(){
      double total = 0;
      int observations = 0;
      for(int i = 0; i < data.size(); i++){
         total += data.get(i).getLoanAmount();
         observations++;
      }
      return total/observations;
   }
   public double standardDeviation(){
      return Math.sqrt(variance());
   }
   public boolean empiricalRule(){
      double observations = 0;
      double withinStandardDev = 0;
      for(int i = 0; i < data.size(); i++){
         if(data.get(i).getLoanAmount() < (mean() + standardDeviation()) && data.get(i).getLoanAmount() > (mean()) - standardDeviation()){
            withinStandardDev++;
         }
         observations++;
      }
      if(withinStandardDev/observations*100 >= 68){
         return true;
      }
      return false;
   }


}