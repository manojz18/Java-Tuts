import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Login Page");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // Create username and password labels and fields
        JLabel userLabel = new JLabel("Enter Gmail:");
        userLabel.setBounds(10, 20, 80, 25);
        frame.add(userLabel);
        
        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        frame.add(userText);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        frame.add(passwordLabel);
        
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        frame.add(passwordText);
        
        // Create login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        frame.add(loginButton);
        
        // Create message label
        JLabel messageLabel = new JLabel();
        messageLabel.setBounds(100, 80, 200, 25);
        frame.add(messageLabel);
        
        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve username and password
                String username = userText.getText();
                String password = new String(passwordText.getPassword());
                
                // Simple validation
                if (username.equals("admin") && password.equals("password")) {
                    messageLabel.setText("Login Successful!");
                } else {
                    messageLabel.setText("Invalid Username or Password");
                }
            }
        });
        
        // Set frame visibility
        frame.setVisible(true);
    }
}
