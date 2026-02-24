package Week_16;
import java.util.Scanner;

public class qn5
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the initial string: ");
        String initial = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(initial);
        
        System.out.print("Enter the second string: ");
        String second = sc.nextLine();
        sb.append(second);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        sb.append(number);
        
        System.out.print("Enter a special character: ");
        char special = sc.next().charAt(0);
        sb.append(special);
        
        System.out.println("Final modified string: " + sb.toString());
        
    }
}