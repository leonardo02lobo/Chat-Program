package Chat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_Usuario_Informacion extends JPanel {

    public Panel_Usuario_Informacion() {
        super.setLayout(null);
        super.setBackground(Color.red);
        Timer t = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Panel_Chat.band){
                    if(posicionX != 580){
                        posicionX-= 2;
                    }
                }
                setLocation(posicionX, 0);
            }
        });
        t.start();
        super.setSize(anchoPantalla, altoPantalla);
        JButton a = new JButton("<--");
        a.setBounds(20,20,100,20);
        add(a);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel_Chat.cambiarPanelChatCompleto(new Panel_Chat());
                Panel_Chat.bandera = true;
            }
        });
    }
    
    Dimension too = super.getToolkit().getScreenSize();
    int anchoPantalla = too.width - 960;
    int altoPantalla = too.height;
    int posicionX = 1040;
}
