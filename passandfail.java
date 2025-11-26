import java.util.Scanner;
/**
 * Write a description of class passandfail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class passandfail
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = scan.nextInt();
        scan.nextLine();
        String result = (marks >= 40)? "Passed an examination" : "Failed an examination";
        System.out.println(result);
        
        
    }
}