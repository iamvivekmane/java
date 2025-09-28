class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class BankAccount {
    String name;
    float balance;
    int password;

    BankAccount(String name, Float balance, int password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    void balanceEnquiry(int password) throws PasswordMismatchException {
        if (password == this.password) {
            System.out.println("Balance                 :   " + this.balance);
        } else {
            throw new PasswordMismatchException("Incorrect password");
        }

    }

    void withdraw(float amount, int password)
            throws PasswordMismatchException, LowBalanceException, NegativeNumberException {
        if (password == this.password) {
            if (amount < 0) {
                throw new NegativeNumberException("Negative amount not allowed");
            } else {
                if (amount > this.balance) {
                    throw new LowBalanceException("Low balance");
                } else {
                    this.balance = this.balance - amount;
                    System.out.println("Amount withrawed        :   " + amount);
                }
            }
        } else {
            throw new PasswordMismatchException("Incorrect password");
        }

    }

    void deposit(float amount, int password) throws PasswordMismatchException,NegativeNumberException {
        if (password == this.password) {
            if (amount<0) {
                throw new NegativeNumberException("Negative amount not allowed");
            }
            else{
                this.balance = this.balance + amount;
                System.out.println("Amount deposited        :   " + amount);
            }
        } else {
            throw new PasswordMismatchException("Incorrect password");
        }
    }

    void transfer(BankAccount b1, float amount, int password)
            throws PasswordMismatchException, LowBalanceException, NegativeNumberException {
        if (password == this.password) {
            if (amount < 0) {
                throw new NegativeNumberException("Negative amount not allowed");
            } else {
                if (amount > this.balance) {
                    throw new LowBalanceException("Low balance");
                } else {
                    this.balance = this.balance - amount;
                    System.out.println("Amount transfered       :   " + amount);
                    System.out.println("Remaining amount        :   " + this.balance);
                    b1.balance = b1.balance + amount;
                }
            }
        } else {
            throw new PasswordMismatchException("Incorrect password");
        }
    }
    public static void main(String[] args) {
        BankAccount[] bankAccount = new BankAccount[2];
        bankAccount[0] = new BankAccount("Suraj", 5000.0f, 1111);
        bankAccount[1] = new BankAccount("Niraj", 1200.0f, 2222);
        try {

            bankAccount[0].balanceEnquiry(1111);
            bankAccount[0].withdraw(500, 1111);
            bankAccount[0].transfer(bankAccount[1], 100, 1111);
            bankAccount[0].deposit(1000, 1111);
            bankAccount[0].balanceEnquiry(1111);
            System.out.println("------------------------------------");
            bankAccount[1].transfer(bankAccount[0], -500, 2222);
        } catch (PasswordMismatchException e) {
            System.out.println(e.getMessage());
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }

    }
}