import java.util.Scanner;

/**
 * Write a description of class sellingrpice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sellingrpice
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        float sellingprice;
        float discount=0;
        System.out.println("Enter markedPrice :");
        float markedprice = scan.nextFloat();
        scan.nextLine();
        System.out.println("Enter category (A/B/C/D)");
        char category = scan.next().charAt(0);
        if (category == 'A'){
            discount = 60;
        }else if (category == 'B'){
            discount = 40;
        }else if (category == 'C'){
            discount = 20;
        }else if (category == 'D'){
            discount = 10;
        }else {
            System.out.println("Invalid category");
        }
        sellingprice = markedprice-(markedprice * discount/100);
        
        System.out.println("Selling price =" +sellingprice);
        
        
    }
}