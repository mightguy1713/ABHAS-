package Week_16;
import java.util.Scanner;

public class qn1
{
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter first name: ");
    String s1 = scan.nextLine();
    
    System.out.println("Enter second name: ");
    String s2 = scan.nextLine();
    
    String combined = s1.concat(s2);
    
    System.out.println("Combined String is : " +combined );
    
    System.out.println("Enter third string: ");
    String s3 = scan.nextLine();
    
    if(combined.equals(s3)){
        System.out.println("The combined string is equal to s3.");
    }
    else{
        System.out.println("The combined string is not equal to s3.");
    }
}
}