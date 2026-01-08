package Week_9;

public class permanentemp extends employees
{
    private double HRA;
    private double DA;
    
    public permanentemp (String name , int id , double basicSalary , double HRA , double DA)
    {
        super (name,id,basicSalary);
        this.HRA = HRA;
        this.DA = DA;
    }
    public void displayPemployee(){
        super.displayEmpInfo();
        System.out.println("Employee HRA :" +this.HRA);
        System.out.println("Employee DA :" +this.DA);
    }
    public double calculateTotalSalary(){
        double total;
        return total = basicSalary + HRA + DA + super.calculateBonus();
    }
}