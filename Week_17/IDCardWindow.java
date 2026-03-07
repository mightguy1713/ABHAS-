package Week_17;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;

public class IDCardWindow extends JFrame
{
    public IDCardWindow(Student s){
        setTitle("Student ID Card Preview");
        
        JLabel label = new JLabel(s.getFormattedDisplay());
        setBounds(50 , 130 , 100 , 150);
        
        add(label);
        
        setSize(450 , 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}