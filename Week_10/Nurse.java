package Week_10;

public class Nurse extends person
{
    private String shift;
    private double extraAllowance;

    public Nurse(int id, String name, String shift, double extraAllowance)
    {
        super(name , id);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }

    @Override
    public double calculateSalary()
    {
        double fixedSalary = 100000;
        return super.calculateSalary() + extraAllowance + fixedSalary;
    }
    @Override
    public String toString()
    {
        return super.toString() +", Shift: " + shift +", Allowance: " + extraAllowance;
    }
}