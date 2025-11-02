
import java.awt.*;
import java.awt.event.*;
/**
 * frame
 */
public class frameCreating {


    frameCreating(){
        Frame fm = new Frame();
        
        Label newLabel = new Label("Welcome to Goa Singham");
        newLabel.setBounds(20, 40, 110, 25);
        fm.add(newLabel); 

        Button b1 = new Button("Click Here");
        b1.setBounds(100, 200, 60, 25);
        fm.add(b1);
        fm.setLayout(null);
        fm.setSize(300, 300);
        fm.setVisible(true);

        fm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        frameCreating fa = new frameCreating();
    }

}
