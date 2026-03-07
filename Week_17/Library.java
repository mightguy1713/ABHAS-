package Week_17;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Library extends JFrame 
{
    JTextField usernameField;
    JButton loginButton;
    JPanel panel;
    
    public Library(){
        setTitle("Library Notice");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel label = new JLabel("Library opens at 7:00 AM");
        label.setBounds(100 , 75 ,200 ,50);
        
        add(panel);
        panel.add(label);
    }
    public static void main(String [] args){
        Library library = new Library();
        library.setVisible(true);
    }
}