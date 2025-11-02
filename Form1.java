import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Form1 extends JFrame {

    public Form1() {
        setTitle("Form 1");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Open Form 2");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form2 form2 = new Form2();
                form2.setVisible(true);
            }
        });

        panel.add(button);
        add(panel);
    }

    public static void main(String[] args) {
        Form1 form1 = new Form1();
        form1.setVisible(true);
    }

    public class Form2 extends JFrame {

        public Form2() {
            setTitle("Form 2");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel panel = new JPanel();
            JButton button = new JButton("Open Form 3");

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Form3 form3 = new Form3();
                    form3.setVisible(true);
                }
            });

            panel.add(button);
            add(panel);
        }
    }

    public class Form3 extends JFrame {

        public Form3() {
            setTitle("Form 3");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel panel = new JPanel();
            add(panel);
        }
    }
}