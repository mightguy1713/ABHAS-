package week_8;

public class HospitalTest {
    public static void main(String[] args) {

        Patient p1 = new Patient("Abhas", 20, 5, 2000);
        Patient p2 = new Patient("Ram", 45, 10, 1800);

        p1.displayDetails();
        p2.displayDetails();
    }
}

