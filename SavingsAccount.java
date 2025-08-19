public class SavingsAccount {
    static float annualInterestRate = 0.04f;
    private float savingsBalance;
    void setSavingBalance(int b)
    {
        savingsBalance = b;
    }
    static void setAnnualInterestRate(int r)
    {
        annualInterestRate = r/100.0f;
    }
    float calculateMonthlyInterest(){

        savingsBalance = savingsBalance + (savingsBalance * annualInterestRate)/12;
        return savingsBalance;
    }
    void modifyInterestRate(int r)
    {
        annualInterestRate = r;
    }
    public static void main(String[] args) {
        SavingsAccount s1  = new SavingsAccount();
        SavingsAccount s2 = new SavingsAccount();
        s1.setSavingBalance(2000);
        s2.setSavingBalance(3000);
        System.out.println("For 4% interest rate");
        System.out.printf("The balance of saver1 is %.2f\n",(s1.calculateMonthlyInterest()));
        System.out.printf("The balance of saver1 is %.2f\n",(s2.calculateMonthlyInterest()));
        setAnnualInterestRate(5);
        
        System.out.println("For 5% interest rate");
        System.out.printf("The balance of saver1 is %.2f\n",(s1.calculateMonthlyInterest()));
        System.out.printf("The balance of saver1 is %.2f\n",(s2.calculateMonthlyInterest()));
    }
}
