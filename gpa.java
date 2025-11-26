import java.util.Scanner;

/**
 * Write a description of class gpa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gpa
{
    public static void main(String [] args){
        String grade;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter GPA (0.0 to 4.0): ");
        double gpa = scan.nextDouble();
        if (gpa < 0.0 && gpa > 4.0) {
        }
        if (gpa >= 3.7) {
            grade = "A";
        } else if (gpa >= 3.0) {
            grade = "B";
        } else if (gpa >= 2.0) {
            grade = "C";
        } else if (gpa >= 1.0) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade:" +grade);
        
    }
    
}