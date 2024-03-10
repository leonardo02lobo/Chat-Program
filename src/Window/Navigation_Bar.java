package Window;

//@author Lio

import Principal.App;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;


public class Navigation_Bar extends JPanel {
Dimension too = super.getToolkit().getScreenSize();
    public Navigation_Bar(){
        super.setSize(too.width, 100);
        super.setLayout(null);
        super.setLocation(0, 0);
//      super.setBackground(new Color(10, 15, 20));
        super.setBackground(Color.red);
    }
    
    
    
    

}
