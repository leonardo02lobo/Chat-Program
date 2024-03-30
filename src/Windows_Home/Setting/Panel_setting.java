package Windows_Home.Setting;

import Utils.Var_necessary;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel_setting extends JPanel{
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_setting() {
        super.setLayout(null);
        super.setBackground(Color.BLUE);
        super.setSize(too.width-273, too.height);
        super.setLocation(0, 0);
    }
}
