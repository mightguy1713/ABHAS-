package week_8;

public class BankAccount
{
    private int accountnumber;
    private double balance;
    private String name;
    
    //getters and setters
    public void setaccountnumber(int accountnumber)
    {
        this.accountnumber = accountnumber;
    }
    public int getaccountnumber()
    {
        return this.accountnumber;
    }
    
    public void setbalance(int balance)
    {
        this.balance = balance;
    }
    public double getbalance()
    {
        return this.balance;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return this.name;
    }
    
     void deposit(double amount){
        balance += amount;
    }
    
    void withdraw(double amount){
        balance -= amount;
    }
}