package Ventana_De_Inicio;

import utilidades_del_programa.Variables_Globales;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana_Inicio extends JPanel {

    public Ventana_Inicio() {
        super.setSize(too);
        super.setLayout(null);
        super.add(Variables_Globales.Panel_Diagonal);
        panel.setLayout(null);
        panel.setLocation(365, 0);
        panel.setSize(too.width - 380, too.height);
        super.add(panel);
        Variables_Globales.tiempo = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CurrentPanel();
            }
        });
        Variables_Globales.tiempo.start();
    }

    private void CurrentPanel() {
        switch (Variables_Globales.Posicion) {
            case 0:
                Cambiar_Paneles(panel,Variables_Globales.Panel_Chat);
                contenido = Variables_Globales.Panel_Chat;
                break;
            case 1:
                Cambiar_Paneles(panel,Variables_Globales.Panel_Comunidad);
                contenido = Variables_Globales.Panel_Comunidad;
                break;
            case 2:
                Cambiar_Paneles(panel,Variables_Globales.Panel_IA);
                contenido = Variables_Globales.Panel_IA;
                break;
            case 3:
                Cambiar_Paneles(panel,Variables_Globales.Panel_compilador);
                contenido = Variables_Globales.Panel_compilador;
                break;
            case 4:
                Cambiar_Paneles(this,Variables_Globales.Panel_Configuracion);
                break;
            case 5:
                Cambiar_Paneles(Variables_Globales.Panel_Diagonal,panel,contenido);
                break;
        }
    }

    private void Cambiar_Paneles(JPanel panel,JPanel content) {
        panel.removeAll();
        panel.add(content, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
        Variables_Globales.tiempo.stop();
    }

    private void Cambiar_Paneles(JPanel diagonal,JPanel content,JPanel content2) {
        super.removeAll();
        super.add(diagonal);
        super.add(content);
        content.add(content2);
        super.revalidate();
        super.repaint();
        Variables_Globales.tiempo.stop();
    }
    JPanel panel = new JPanel();
    Dimension too = super.getToolkit().getScreenSize();
    JPanel contenido = new JPanel();
}
