package Week_17;
import java.awt.*;
import javax.swing.*;

public class StudentWindow extends JFrame
{
    public StudentWindow(){
        setTitle("Student Profile");
        setSize(400 , 300);
    }
    public static void main(String [] args){
        SwingUtilities.invokeLater(()->
        {
            StudentWindow student = new StudentWindow();
            student.setVisible(true);
        });
    }
}