import java.util.Scanner;

/**
 * Write a description of class qn9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qn9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        int rev = 0;
        while(num > 0)
        {
            int digit = num % 10;    
            rev = rev * 10 + digit;  
            num = num / 10;        
        }
        System.out.println("Reversed number: " + rev);
    }
}
