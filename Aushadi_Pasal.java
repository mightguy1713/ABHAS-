import java.util.Scanner;
/**
 * Write a description of class Aushadi_Pasal here.
 * @author (Abhas Shakya)
 */
public class Aushadi_Pasal
{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter medicine name:");
       String name = scan.nextLine();
       System.out.println("Enter quantity:");
       int qty = scan.nextInt();
       scan.nextLine();
       System.out.println("Enter price of table:");
       double price = scan.nextDouble();
       scan.nextLine();
       System.out.println("Requirement of presciption (Yes/No):");
       String response = scan.nextLine();
       //Report of the medicines.
       System.out.println("*******************************************");
       System.out.println("----------Aushadhi Pasal Report------------");
       System.out.println("*******************************************");
       System.out.println("Name :" +name);
       System.out.println("Quantity :" +qty);
       System.out.println("Price(In Rs) :" +price);
       System.out.println("Prescription :" +response);
       System.out.println("*******************************************");
       System.out.println("Available stock of medicine : 1500");
    }
}
