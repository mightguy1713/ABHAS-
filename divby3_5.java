import java.util.Scanner;

/**
 * Write a description of class divby3_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divby3_5
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scan.nextInt();
        scan.nextLine();
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Number is divisible by both 3 and 5");
        }else if ( num % 3 == 0 ){
            System.out.println("Number is only divisible by 3");            
        }else if (num % 5 ==0){
            System.out.println("Number is only divisible by 5");
        }
        else {
            System.out.println("Number is not divisible by 3 or 5");
        }
    }
}