package Week_7;

public class BankAccount
{
    int account_number;
    String holders_name;
    double balance;
    
    void deposit(double amount){
        balance = balance + amount;
    }
    
    void withdraw(double amount){
        balance = balance - amount;
    }
}