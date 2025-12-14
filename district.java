import java.util.Scanner;
/**
 * Write a description of class district here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class district
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        String [] district = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        for (int i =0; i<district.length;i++){
        System.out.println("The districts are: " +district[i]);
    }
    System.out.print("\n How many districts do you want to add? ");
        int n = scan.nextInt();
        scan.nextLine(); 
        String[] newDist = new String[n];
        System.out.println("Enter district names:");
        for(int i = 0; i < n; i++)
        {
            newDist[i] = scan.nextLine();
        }
        System.out.println("Updated Districts:");
        for(int i = 0; i < n; i++)
        {
            System.out.println((i+1) + ")"+ newDist[i]);
        }
    }
}