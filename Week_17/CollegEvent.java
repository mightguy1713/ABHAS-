package Week_17;
import javax.swing.*;
import java.awt.*;

public class CollegEvent extends JFrame
{
    public CollegEvent(){
        setTitle("College Event Announcment");
        setSize(400,300);
        getContentPane();
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(173 , 216 , 230));
        
        JLabel label = new JLabel("Welcome to Orientation Day");
        label.setBounds(100 , 75 , 200 ,50);
        
        panel.setLayout(null);
        add(panel);
        panel.add(label);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static void main(String [] args){
        CollegEvent event = new CollegEvent();
        event.setVisible(true);
    }
}