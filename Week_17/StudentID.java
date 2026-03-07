package Week_17;
import javax.swing.*;
import java.awt.*;

public class StudentID extends JFrame
{
    public StudentID(){
        setTitle("Student ID card");
        setSize(500 , 400);
        
        JPanel panel = new JPanel();
        panel.setBounds(20 , 30 , 300 , 300);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        String htmlText = "<html><body style = 'text-align: center;'>"
        +"<p>Name :Abhas Shakya</p>"
        +"<p>Module :Programming</p>"
        +"<p>College : Islington College</p>"
        +"</div></body></html>";
        
        JLabel label = new JLabel(htmlText , SwingConstants.CENTER);
        //label.setHorizontalAlignment(SwingConstants.CENTER);
        //label.setVerticalAlignment(SwingConstants.CENTER);
        label.setBounds(50 , 50 , 200, 200);
        //label.setFont(new Font("Arial" , Font.BOLD, 24));
        //label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        add(panel);
        panel.add(label);
        panel.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    }
    public static void main(String [] args){
            StudentID id = new StudentID();
            id.setVisible(true);
    }
}