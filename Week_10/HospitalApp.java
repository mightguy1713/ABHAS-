package Week_10;

public class HospitalApp
{
     public static void main(String[] args)
    {
        doctor d1 = new doctor(1, "Abhas", "Pateology", 20000);
        Nurse n1 = new Nurse(2, "Abdica", "Night", 8000);

        System.out.println(d1);
        System.out.println("Doctor Salary: " + d1.calculateSalary(3));

        System.out.println();

        System.out.println(n1);
        System.out.println("Nurse Salary: " + n1.calculateSalary());
    }
}