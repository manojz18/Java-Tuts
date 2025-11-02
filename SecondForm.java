import javax.swing.*;

public class SecondForm extends JFrame {
    public SecondForm() {
        // Create the frame for the second form
        setTitle("Second Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create a label for the second form
        JLabel label = new JLabel("Welcome to the Second Form!");
        label.setBounds(50, 50, 200, 30);
        add(label);
    }
}
