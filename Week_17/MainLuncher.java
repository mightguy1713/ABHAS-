package Week_17;
import javax.swing.SwingUtilities;

public class MainLuncher
{
    public static void main(String [] args){
        
        SwingUtilities.invokeLater(() ->{
            Student s1 = new Student(39332 , "Abhas" , "Computing");
            Student s2 = new Student(39823 , "Ram" , "Networking");
            
            new IDCardWindow(s1);
            new IDCardWindow(s2);
        });
        
    }
}