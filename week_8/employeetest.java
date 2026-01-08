package week_8;
import java.util.Scanner;

public class employeetest
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter basic salary: ");
        double salary = scan.nextDouble();

        employee emp = new employee(salary);
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Gross Salary: " + emp.calculateGrossSalary());
    }
}