package Week_12;
import java.util.ArrayList;

public class mainClass 
{
    public static void main (String [] args){
        ArrayList<Students> student = new ArrayList();
        
        student.add(new Students("Ayush" , "9876543210" , "L1N1" ));
        student.add(new Students("Rahul" , "9876543211" , "L1M1"));
        student.add(new Students("Gaurav" , "9876543212" , "L1N2"));  
        
        for(Students std: student)
        {
            System.out.println(std);
        }
        
        student.remove(2);
        System.out.println(student);
        
        student.add(0 ,new Students("Aavaya" , "987654313" , "L1C1"));
        System.out.println(student);
        
    }
}