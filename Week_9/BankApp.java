package Week_9;

public class BankApp
{
    public static void main(String [] args){
        System.out.println("Saving account :");
        SavingAccount s1 = new SavingAccount(101 , "Abhas" , 100000, 2);
        System.out.println("Display:");
        s1.displayInfo();
        System.out.println("Interenst :" +s1.calculateInterest());
        
        System.out.println("Current Account :");
        CurrentAccount c1 = new CurrentAccount(112,"Annal",232300,10000);
        System.out.println("Display:");
        c1.displayInfo();
        System.out.println("Interenst :" +c1.withdraw(10000));
    }
}