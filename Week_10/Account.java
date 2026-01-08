package Week_10;

public class Account
{
    private String holderName;
    private int accountNo;
    protected double balance;
    
    public Account(String holderName , int accountNo ,double balance){
        this.holderName = holderName;
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public String getholderName(){
        return holderName;
    }
    public void setholderName(String holderName){
        this.holderName = holderName;
    }
    
    public int getaccountNo(){
        return accountNo;
    }
    public void setaccountNo(int setaccountNo){
        this.accountNo = accountNo;
    }
    
    public double getbalance(){
        return balance;
    }
    public void setbalance(double getbalance){
        this.balance = balance;
    }
    
    public double calculateInterest(){
        return balance * 0.10;
    }
    
    public String toString(){
        return "Account Holder name : " +holderName + " ,Account No : " +accountNo + " ,Balance : " +balance ;
    }
}