package week_8;

public class Patient {

    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;

    public Patient(String patientName, int age, int daysAdmitted, double dailyCharge) {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public double calculateTotalBill() {
        double totalBill = daysAdmitted * dailyCharge;

        if (daysAdmitted > 7) {
            totalBill = totalBill - (totalBill * 0.10);
        }

        return totalBill;
    }

    public void displayDetails() {
        System.out.println("Patient Name  : " + patientName);
        System.out.println("Age : " + age);
        System.out.println("Days Admitted : " + daysAdmitted);
        System.out.println("Daily Charge : Rs. " + dailyCharge);
        System.out.println("Total Bill: Rs. " + calculateTotalBill());
    }
}
