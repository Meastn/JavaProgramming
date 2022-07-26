package day31_CustomClass_Constructors;

public class BankAccount {
    public String accountHolder;
    public int accountNumber;
    public double balance;

    public void setInfo(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance () {
        System.out.println(accountHolder   + ", your available balance is = $" + balance);
    }

    public void deposit (double amount) {
        if (amount <= 0) {
            System.out.println(accountHolder   + "Depositing amount can not be zero or negative");
            return;
        }
        balance += amount;
    }

    public void withdraw (double amount) {
        if (amount > balance) {
            System.out.println(accountHolder   + ", you have insufficient balance");
            return;
        }
        if (amount <= 0) {
            System.out.println("Withdrawing amount can not be zeor or negative");
            return;
        }
        balance -= amount;
    }
}
