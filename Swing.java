import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame implements ActionListener{

    private JButton btn;

    public Swing()
    {
        setTitle("Simple GUI");

        btn = new JButton("Openframe");
        btn.addActionListener(this);
        btn.setBackground(Color.yellow);

        getContentPane().setBackground(Color.cyan);

        add(btn);
        setLayout(null);
        btn.setBounds(20, 20, 200,40);

        setSize(400, 400);
    }

    public void actionPerformed(ActionEvent e){
        String cmd =e.getActionCommand();
        if(cmd.equals("Openframe")){
            new SecondFormm();
        }
    } 

    public static void main(String[] args) {
        new Swing().setVisible(true);
    }
}