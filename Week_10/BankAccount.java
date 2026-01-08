package Week_10;

public class BankAccount
{
    // to follow encapsulation, make attributes private
    private long accountNumber;
    private String holderName;
    private double balance;
    
    //constructor
    public BankAccount(long accountNumber , String holderName , double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    public void setAccountNumber(long newAccountNumber){
        this.accountNumber = newAccountNumber;
    }
    
    public long getAccountNumber(){
        return this.accountNumber;
    }
    //getter for balance 
    public double getBalance(){
        return this.balance;
    }
    
    public void deposit(double amount){
        if(amount > 0){
            this.balance = amount;
            System.out.println("The deposited amount is : "+amount);
            System.out.println("Balance after deposition :"+this.getBalance());
        }
        else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    protected double getInterest(){
        return 0.0;
    }
    
    public double getCompoundInterest(double years){
        return (this.getBalance() * getInterest() * years)/100;
    }
}