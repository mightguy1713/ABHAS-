import java.util.Scanner;

/**
 * Write a description of class Islington here.
 *
 * @author (Abhas Shakya)
 * @version (a version number or a date)
 */
public class Islington{
    public static void main(String[] args){
        System.out.println("Coverage of Scanner class");
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first number:");
        int firstNum = scan.nextInt();
        System.out.println(firstNum);
        
        
        // Ternery operator
        int age = 18;
        System.out.println("Age is: "+age);
        String isValid = (age>=18) ? "He can drive" : "He cant drive" ;
        System.out.println(isValid);
    
    }
}