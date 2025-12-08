 import java.util.Scanner;
/**
 * Write a description of class qn7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class qn7 {
    public static void main(String[] args) {
         char choice = 'y';
         Scanner sc = new Scanner(System.in);
         while(choice == 'y' || choice == 'Y')
        {
            System.out.print("Enter first number: ");
            double n1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double n2 = sc.nextDouble();
            System.out.print("Enter operation (+, -, , /): ");
            char op = sc.next().charAt(0);
            double ans = 0;
            if(op == '+')
                ans = n1 + n2;
            else if(op == '-')
                ans = n1 - n2;
            else if(op == '*')
                ans = n1 * n2;
            else if(op == '/')
                ans = n2 != 0 ? n1 / n2 : 0;
            else
                System.out.println("Wrong operation!");

            System.out.println("Result = " + ans);

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        }
    }
}