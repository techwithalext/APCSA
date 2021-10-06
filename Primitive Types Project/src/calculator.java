public class calculator {

    public static void main(String[] args){

        //Hourly Rate
        int hourlyRate = 86;

        //Monthly Expenses
        int monthlyRent = 2840;
        int carPayment = 500;
        int carInsurance = 1223;
        int groceries = 500;
        int gymMembership = 40;
        int utilities = 300;
        int cellPhone = 30;

        //Calculating Monthly Income, Expenses and Savings
        int hoursWorkedPerWeek = 40;
        int weeksWorkedPerMonth = 4;
        int monthlyExpenses = hourlyRate + monthlyRent+ carPayment + carInsurance + groceries + gymMembership + utilities + cellPhone;
        int weeklyIncome = hourlyRate * hoursWorkedPerWeek;
        int monthlyIncome = weeklyIncome * weeksWorkedPerMonth;
        int monthlySavings = monthlyIncome - monthlyExpenses;

        //Prints values to the user
        System.out.print("Monthly Income: $");
        System.out.println(monthlyIncome);
        System.out.print("Monthly Expenses: $");
        System.out.println(monthlyExpenses);
        System.out.print("Monthly Savings: $");
        System.out.println(monthlySavings);


    }


}
