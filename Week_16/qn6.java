package Week_16;
import java.util.Scanner;

public class qn6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed string: " + rev);

        if(str.equals(rev))
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
    }
}