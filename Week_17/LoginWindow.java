package Week_17;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame
{
    JTextField usernameField;
    JButton loginButton;
    JPanel panel;

    public LoginWindow()
    {
        setTitle("Login Window");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null); 

        usernameField = new JTextField();
        usernameField.setBounds(120, 100, 150, 30);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        loginButton.setBackground(Color.GREEN);

        panel.add(usernameField);
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new LoginWindow();
            }
        });
    }
}