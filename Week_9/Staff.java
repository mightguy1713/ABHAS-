package Week_9;

public class Staff extends Person {
    int workingHours;
    double ratePerHour;

    public Staff(int id, String name, double basicSalary ,int workingHours, double ratePerHour) {
        super(id , name,basicSalary);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }
    public double calculateSalary() {
        return workingHours * ratePerHour;
    }
}
