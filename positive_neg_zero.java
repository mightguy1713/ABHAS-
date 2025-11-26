import java.util.Scanner;

/**
 * Write a description of class positive_neg_zero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class positive_neg_zero
{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        scan.nextLine();
        if(num > 0){
            System.out.println("Positive number");
        }else if(num < 0){
            System.out.println("Negative number");
        }else {
            System.out.println("Number is zero");
        }
    }
}