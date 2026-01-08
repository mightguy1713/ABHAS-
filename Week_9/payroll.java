package Week_9;

public class payroll
{
    public static void main(String [] args){
        System.out.println("permanet emp :");
        permanentemp p1 = new permanentemp("Abhas" , 101 ,100000 , 1000 , 2500);
        System.out.println("Display :");
        p1.displayPemployee();
        System.out.println("Total Salary :" +p1.calculateTotalSalary());
        
        System.out.println("contract emp :");
        Cemployee p2 = new Cemployee("Annal" , 1023 ,75000 ,30);
        System.out.println("Display :" );
        p2.displayCemployee();
        System.out.println("Total Salary :"+p2.calculateTotalSalary());
    }
}