import java.util.Scanner;

/**
 * Write a description of class evenorodd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class evenorodd
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        scan.nextLine();
        if(num % 2 == 0){
            System.out.println("Number is even");
        }
         else{
            System.out.println("Number is odd");
         }
        }
    }
