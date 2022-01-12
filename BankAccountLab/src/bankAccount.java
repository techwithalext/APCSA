public class bankAccount {
    public String name;
    private int account;
    private double balance;
    private static int numObjects = 0;
    public bankAccount(){
        numObjects++;
        name = "N/A";
        account = 0;
        balance = 0;
    }
    public bankAccount(String name, int account, double balance){
        numObjects++;
        this.name = name;
        this.account = account;
        this.balance = balance;
    }
    public String toString(){
        return name + ": $" + balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("Error: Not enough money in account");
        }
    }
    public static int getNumObjects(){
        return numObjects;
    }

}