package Week_10;

public class ExamApp
{
    public static void main(String [] args){
        ScienceStudent s1 = new ScienceStudent(1 , "Annal" , 50);
        ManagementStudent m1 = new ManagementStudent (2 , "Abhas" , 75);
        
        System.out.println(s1);
        System.out.println("Science Result :" +s1.calculateResult());
        
        System.out.println();
        
        System.out.println(m1);
        System.out.println("Management Result :" +m1.calculateResult());
   }
}