public class Main {
    public static void main(String[] args){
        bankAccount a = new bankAccount();
        bankAccount b = new bankAccount("Alex", 14569, 96000.00);
        bankAccount c = new bankAccount("Ms. Fournier", 14569, 100000.00);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        c.withdraw(1000);
        System.out.println(c);
        b.withdraw(1000);
        System.out.println(b);
        c.withdraw(9824);
        System.out.println(c);
        b.withdraw(5496);
        System.out.println(b);
        c.withdraw(931);
        System.out.println(b);
        b.deposit(10496);
        System.out.println(b);
        c.deposit(1234569);
        System.out.println(c);
        System.out.println(bankAccount.getNumObjects());
    }
}