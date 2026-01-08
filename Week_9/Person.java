package Week_9;

public class Person
{
    protected int id;
    protected String name;
    protected double basicSalary;
    protected String collegename;
    
    Person(int id, String name , String collegename ,double basicSalary){
        this.id = id;
        this.name = name;
        this.collegename = collegename;
    }
    public double calculateAnnualSalary(){
        return basicSalary * 12;
    }
}