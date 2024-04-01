package Chat;

import utilidades_del_programa.Variables_Globales;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel_Chat extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Chat() {
        super.setLayout(null);
        super.setBackground(Color.GREEN);
        super.setLocation(0, 0);
        super.setSize(too.width - 380, too.height);
    }

}


