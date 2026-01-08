package Week_10;

public class Current_Account extends Account
{
    public Current_Account(String holderName , int accountNo , double balance){
        super(holderName , accountNo ,balance);
    }
    
    @Override 
    public double calculateInterest(){
        return super.calculateInterest() + (balance * 0.05);
    }
    
    public double calculateInterest(double rate){
        return balance * rate;
    }
}