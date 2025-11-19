import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[] args){
        
        //Question no 5.
        System.out.println(" Scanner class ");
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first number: ");
        int firstNum = scan.nextInt();
        System.out.println(firstNum);
        System.out.println("Enter second number: ");
        double secondNum = scan.nextDouble();
        System.out.println(secondNum);
    }
    
}