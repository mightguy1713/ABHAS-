package Week_9;

public class Cemployee extends employees
{
    private int workingDays;
    
    public Cemployee (String name , int id , double basicSalary , int workingDays)
    {
        super(name,id,basicSalary);
        this.workingDays = workingDays;
    }
    public void displayCemployee(){
        super.displayEmpInfo();
        System.out.println("Employee working days:" +this.workingDays);
   }
   public double calculateTotalSalary(){
       double total;
       total = basicSalary + workingDays;
       return total;
   }
}
