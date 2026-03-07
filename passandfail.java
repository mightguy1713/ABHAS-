import java.util.Scanner;

public class passandfail
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = scan.nextInt();
        scan.nextLine();
        String result = (marks >= 40)? "Passed an examination" : "Failed an examination";
        System.out.println(result);
    }
}