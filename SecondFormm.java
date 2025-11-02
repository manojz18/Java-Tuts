import javax.swing.JFrame;
import javax.swing.JLabel;
public class SecondFormm extends JFrame{
    public SecondFormm(){
        setTitle("Another GUI");

        add(new JLabel("Empty JFrame"));
        setSize(400,400);
        setVisible(true);
    }
}