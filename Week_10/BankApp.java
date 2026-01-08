package Week_10;

public class BankApp
{
    public static void main(String [] agrs){
    SavingAccount s1 = new SavingAccount("Abhas", 101 , 50000);
    Current_Account c1 = new Current_Account("Abdica" , 103 ,30000);
    
    System.out.println(s1);
    System.out.println("Interest of Saving Account: " +s1.calculateInterest());
    
    System.out.println();
    
    System.out.println(c1);
    System.out.println("Intest of Current Account :" +c1.calculateInterest());
    }
}