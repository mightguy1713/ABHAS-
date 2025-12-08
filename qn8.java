import java.util.Scanner;
/**
 * Write a description of class qn8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qn8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " + num);
        for(int i = 1; i <= 10; i++)
        {
            int output = num * i;
            System.out.println(num + " x " + i + " = " + output);
        }
    }
}
