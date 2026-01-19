package Week_12;
import java.util.ArrayList;

public class StudentApp
{
    public static void main(String [] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(39332 , "Abhas" , 87));
        students.add(new Student(39321 , "Abdica" , 89));
        students.add(new Student(39323 , "Diya" , 92));
        
        System.out.println(students.get(0));
        
        for(Student std: students)
        {
            System.out.println(std);
        }
    }
}