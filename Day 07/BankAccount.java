public class BankAccount {
    String name;
    float balance;

    BankAccount(String name, Float balance) {
        this.name = name;
        this.balance = balance;
    }

    void balanceEnquiry() {
        System.out.println("Balance                 :   " + this.balance);
    }

    void withdraw(float amount) {
        this.balance = this.balance - amount;
        System.out.println("Amount withrawed        :   " + amount);
    }

    void deposit(float amount) {
        this.balance = this.balance + amount;
        System.out.println("Amount deposited        :   " + amount);
    }

    void transfer(BankAccount b1, float amount) {
        this.balance = this.balance - amount;
        System.out.println("Amount transfered       :   " + amount);
        System.out.println("Remaining amount        :   "+this.balance);
        b1.balance = b1.balance + amount;
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Suraj", 500.0f);
        BankAccount b2 = new BankAccount("Niraj", 1200.0f);
        b1.balanceEnquiry();
        b1.withdraw(150);
        b1.deposit(1000);
        b1.transfer(b2, 100);
        b1.balanceEnquiry();

        System.out.println("------------------------------------");
        b2.transfer(b1, 500);
    }
}