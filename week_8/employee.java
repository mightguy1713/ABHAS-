package week_8;

public class employee
{
    private double basic_salary;
    
    public employee(double salary)
    {
        basic_salary = salary;
    }
    
    public double calculateGrossSalary()
    {
        double bonus = basic_salary * 0.20;
        return basic_salary + bonus;
    }

    public double getBasicSalary()
    {
        return basic_salary;
    }
}