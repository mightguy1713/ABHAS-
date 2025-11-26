import java.util.Scanner;

/**
 * Write a description of class nestedif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nestedif
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scan.nextInt();
        scan.nextLine();
        if (num % 3 == 0) {                  
            if (num % 5 == 0) {           
                System.out.println("The number is divisible by both 3 and 5.");
            } else {
                System.out.println("The number is divisible by 3 but not by 5.");
            }
        } else {
            if (num % 5 == 0) {
                System.out.println("The number is divisible by 5 but not by 3.");
            } else {
                System.out.println("The number is not divisible by both 3 and 5.");
            }
        }
    }
}