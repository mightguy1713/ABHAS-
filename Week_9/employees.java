package Week_9;

public class employees
{
    protected String name;
    protected int id;
    protected double basicSalary;
    
    public employees (String name , int id , double basicSalary){
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }
    public void displayEmpInfo(){
        System.out.println("Employee name: " +this.name);
        System.out.println("Employee id: " +this.id);
        System.out.println("Employee basic Salary: " +this.basicSalary);
    }
    public double calculateBonus(){
        return basicSalary * 0.10;
    }
}