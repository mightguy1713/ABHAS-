package Week_9;

public class SavingAccount extends BankAccount
{
    private int interestRate;
    
    public SavingAccount(int accountNumber,String accountHolderName,double balance,int interestRate)
    {
        super(accountNumber,accountHolderName,balance);
        this.interestRate = interestRate;
    }
    public void displayInfo(){
        super.displayInfo();
         System.out.println("Interest rate : "+this.interestRate);
    }
    public double calculateInterest(){
        double interest;
        interest = super.getBalance() * this.interestRate / 100;
        return interest;
    }
}