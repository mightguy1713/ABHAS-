package Week_7;

public class Main_classbank
{
    public static void main (String [] args){
        BankAccount b1 = new BankAccount();
        b1.account_number = 1011;
        b1.holders_name = "Abhas";
        b1.balance = 100000;
        
        System.out.println("Bank details 1: ");
        System.out.println("Accounts number: " +b1.account_number);
        System.out.println("Accounts holders name: " +b1.holders_name);
        System.out.println("Accounts balance: Rs." +b1.balance);
        System.out.println();
        
        BankAccount b2 = new BankAccount();
        b2.account_number = 1234;
        b2.holders_name = "Ram";
        b2.balance = 50000;
        
        System.out.println("Bank details 2: ");
        System.out.println("Accounts number: " +b2.account_number);
        System.out.println("Accounts holders name: " +b2.holders_name);
        System.out.println("Accounts balance: Rs." +b2.balance);
        System.out.println();
        
        //deposits and withdraws.
        b1.deposit(10000);
        b1.withdraw(5000);
        
        b2.deposit(15000);
        b2.withdraw(7500);
        
        System.out.println("Final balace of both accounts :");
        System.out.println("Final account balance 1: Rs." +b1.balance);
        System.out.println("Final account balance 2: Rs." +b2.balance);
    }
}