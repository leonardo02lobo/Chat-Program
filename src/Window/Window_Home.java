package Window;

import Principal.App;
import java.awt.Color;
import javax.swing.JPanel;

public class Window_Home extends JPanel{
    
    public Window_Home() {
        super.setSize(App.width, App.height);
        super.setLayout(null);
        super.setBackground(new Color(10, 15, 20));
    }
}
