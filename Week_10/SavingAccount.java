package Week_10;

public class SavingAccount extends Account
{
    public SavingAccount(String holderName , int accountNo ,double balance){
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