package Week_17;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

public class Window extends JFrame
{
    public Window(){
        setTitle("Login Window");
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        
        JLabel label = new JLabel("Username: ");
        label.setBounds(70, 50, 100, 30);
        
        JTextField txtField = new JTextField();
        txtField.setBounds(150, 50, 100, 30);
        
        JButton btn = new JButton("Submit");
        btn.setBounds(150 , 100 , 75, 30);
        btn.setForeground(Color.DARK_GRAY);
        btn.setBackground(Color.GREEN);
    
        panel.setLayout(null);
        panel.add(label);
        panel.add(txtField);
        panel.add(btn);
        add(panel);
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String [] args){
        Window window = new Window();
        window.setVisible(true);
    }
}