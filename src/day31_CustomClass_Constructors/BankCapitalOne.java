package day31_CustomClass_Constructors;

public class BankCapitalOne {
    public static void main(String[] args) {

        BankAccount account1= new BankAccount();
        BankAccount account2= new BankAccount();

        account1.setInfo("Ali Veli", 11443267, 31000);
        account2.setInfo("Kırkdokuz Elli", 1468437, 4000);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();
        account2.withdraw(4500);

    }
}
