import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    public static void main(String[] args) {
        // Create the main frame
        JFrame mainFrame = new JFrame("Main Form");
        mainFrame.setSize(300, 150);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);

        // Create a button to navigate to the next form
        JButton nextButton = new JButton("Go to Next Form");
        nextButton.setBounds(50, 50, 200, 30);
        mainFrame.add(nextButton);

        // Add action listener to the button
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create and display the second form
                SecondForm secondForm = new SecondForm();
                secondForm.setVisible(true);
                // Optionally close the main form
                mainFrame.dispose();
            }
        });

        // Set frame visibility
        mainFrame.setVisible(true);
    }
}

