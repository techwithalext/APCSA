public class Loan {
    private int ID;
    private double loanAmount;
    private String country;
    private int daysToFund;
    private int numLenders;

    public Loan(int ID, double loanAmmount, String country, int daysToFund, int numLenders){
        this.ID = ID;
        this.loanAmount = loanAmmount;
        this.country = country;
        this.daysToFund = daysToFund;
        this.numLenders = numLenders;
    }
    public int getID(){
        return this.ID;
    }
    public double getLoanAmount(){
        return this.loanAmount;
    }
    public String getCountry(){
        return this.country;
    }
    public int getDaysToFund(){
        return this.daysToFund;
    }
    public int getNumLenders(){
        return this.numLenders;
    }
    public String toString(){
        return "ID: " + this.ID + "\nLoan Amount: " + this.loanAmount + "\nCountry: " + this.country + "\nDays to fund: " + this.daysToFund + "\nNumber of Lenders: " + this.numLenders;
    }

    public void setID(int ID){
        this.ID = ID;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setDaysToFund(int daysToFund){
        this.daysToFund = daysToFund;
    }
    public void setNumLenders(int numLenders){
        this.numLenders = numLenders;
    }
}
