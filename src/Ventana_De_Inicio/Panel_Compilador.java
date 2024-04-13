package Ventana_De_Inicio;

import Chat.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_Compilador extends JPanel{
    
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Compilador() {
        super.setLayout(null);
        super.setBackground(Color.red);
        super.setLocation(0, 0);
        super.setSize(too.width - 145, too.height);
        JButton a = new JButton("volver");
        a.setBounds(20,20,100,20);
        add(a);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana_Inicio.panel.removeAll();
                Ventana_Inicio.panel.add(new Panel_Chat(), BorderLayout.CENTER);
                Ventana_Inicio.panel.revalidate();
                Ventana_Inicio.panel.repaint();
            }
        });
    }
}
