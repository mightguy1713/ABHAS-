package Week_9;

public class CurrentAccount extends BankAccount
{
    private int overdraftlimit;
    
    public CurrentAccount(int accountNumber,String accountHolderName,double balance,int overdraftlimit)
    {
        super(accountNumber,accountHolderName,balance);
        this.overdraftlimit = overdraftlimit;
    }
    public void displaycinfo(){
        super.displayInfo();
         System.out.println("Overdraft limit" +this.overdraftlimit);
    }
    public boolean withdraw(double amount){
        if (amount <= getBalance() + overdraftlimit) {
        balance -= amount;
        return true;
    } else {
        return false;
    }
}
}