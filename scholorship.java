   import java.util.Scanner;
/**
 * Write a description of class scholorship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scholorship
{
public class ScholarshipChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gpa;
        double attendance;
        int attitude;
        System.out.print("Enter GPA: ");
        gpa = scan.nextDouble();
        System.out.print("Enter attendance percentage: ");
        attendance = scan.nextDouble();
        System.out.print("Enter attitude score (1–10): ");
        attitude = scan.nextInt();
        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("Student is eligible for the scholarship!");
                } else {
                    System.out.println("Not eligible: Attitude score too high.");
                }
            } else {
                System.out.println("Not eligible: Attendance below required level.");
            }
        } else {
            System.out.println("Not eligible: GPA below 3.2.");
        }
    }
}

}