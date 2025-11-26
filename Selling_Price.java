import java.util.Scanner;

/**
 * Write a description of class Selling_Price here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Selling_Price
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
        switch(category){
            case 'A': discount = 60;break;
            case 'B': discount = 40; break;
            case 'C': discount = 20;break;
            case 'D': discount = 10;break;
            default : System.out.println("Invalid category");
        }
        sellingprice = markedprice-(markedprice*discount/100);
        System.out.println("Selling price is :" + sellingprice);
    }
}