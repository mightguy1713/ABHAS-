package week_8;

public class atm
{
    public static void main(String [] args){
        BankAccount b1 = new BankAccount();
        b1.setaccountnumber(121313);
        b1.setbalance(1000000);
        b1.setName("Abhas");
        
        b1.deposit(10000);
        b1.withdraw(5000);
        
        System.out.println("Final balace of both accounts :");
        System.out.println("Final account balance : Rs." +b1.getbalance());
    }
}