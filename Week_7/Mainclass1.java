package Week_7;

public class Mainclass1
{
    public static void main(String [] args){
        employee e1 = new employee();
        e1.id = 39332;
        e1.name = "Abhas";
        e1.salary = 100000.50;
        
        System.out.println("Employee 1 :");
        System.out.println("E1 id :" +e1.id);
        System.out.println("E1 name :" +e1.name);
        System.out.println("E1 salary :" +e1.salary);
        System.out.println();
        
        employee e2 = new employee();
        e2.id = 32121;
        e2.name = "Diya";
        e2.salary = 75000.50;
        
        System.out.println("Employee 2 :");
        System.out.println("E2 id :" +e2.id);
        System.out.println("E2 name :" +e2.name);
        System.out.println("E2 salary :" +e2.salary);
        System.out.println();
        
        employee e3 = new employee();
        e3.id = 32323;
        e3.name = "Ram";
        e3.salary =50000.0;
        
        System.out.println("Employee 3 :");
        System.out.println("E3 id :" +e3.id);
        System.out.println("E3 name :" +e3.name);
        System.out.println("E3 salary :" +e3.salary);
        System.out.println();
        
        employee high = e1;
        if (e2.salary > high.salary)
            high = e2;

        if (e3.salary > high.salary)
            high = e3;
            
        System.out.println("The highest salary is :");
        System.out.println("\n id: " + high.id + "\n name: "  + high.name +  "\n salary :" + high.salary);        
    }
}