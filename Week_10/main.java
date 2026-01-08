package Week_10;

public class main
{
    public static void main(String [] args){
        
        //long accountNumber , String holderName , double balance
        SavingClass acc1 = new SavingClass(10232 , "Abhas" , 100000);
        CurrentAccount acc2 = new CurrentAccount(23232 , "Abdica" , 100000);
        
        double interest1 = acc1.getCompoundInterest(5);
    }
}