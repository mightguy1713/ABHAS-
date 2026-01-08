package Week_10;

public class SavingClass extends BankAccount
{
    public SavingClass(long accountNumber , String holderName , double balance){
        super(accountNumber , holderName , balance);
    }
    
    @Override
    protected double getInterest(){
        return 2.0;
    }
}