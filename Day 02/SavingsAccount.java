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
}
