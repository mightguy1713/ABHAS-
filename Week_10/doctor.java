package Week_10;

public class doctor extends person
{
    private String specialization;
    private double consultationFee;
    
    public doctor(int id , String name, String specialization , double consultationFee){
        super(name , id);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateSalary()
    {
        double fixedSalary = 500000;
        return super.calculateSalary() + consultationFee +fixedSalary;
    }

    public double calculateSalary(int emergencyCases)
    {
        return calculateSalary() + (emergencyCases * 500);
    }
    
     @Override
    public String toString()
    {
        return super.toString() +", Specialization: " + specialization + ", Fee: " + consultationFee;
    }
}