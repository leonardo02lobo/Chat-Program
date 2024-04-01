package Ventana_De_Inicio;

import utilidades_del_programa.Variables_Globales;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_Diagonal extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Diagonal() {
        super.setLayout(null);
        super.setBackground(Variables_Globales.Color);
        super.setLocation(0, 0);
        super.setSize(365, too.height);
        init();
    }

    private void init() {
        iniciarLabel((getWidth() / 2) - 150, 90, 50, 30, Chat_Label, "Chat");
        iniciarLabel(getWidth() / 2, 90, 150, 30, Comunidad_Label, "Community");
        iniciarLabel(getWidth() - 100, 20, 100, 50, Configuracion_Label, "Setting");
        iniciarLabel(getWidth()-355, 20, 150, 50, Label_Logo, "Chat Programer");
    }

    private void iniciarLabel(int x, int y, int ancho, int alto, JLabel label, String texto) {
        label.setText(texto);
        label.setBounds(x, y, ancho, alto);
        label.setForeground(Color.white);
        label.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 20));
        super.add(label);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Variables_Globales.tiempo.start();
                if (e.getSource().equals(Chat_Label)) {
                    Variables_Globales.Posicion = 0;
                } else if (e.getSource().equals(Comunidad_Label)) {
                    Variables_Globales.Posicion = 1;
                } else if (e.getSource().equals(Configuracion_Label)) {
                    Variables_Globales.Posicion = 4;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.getSource() != Label_Logo){
                    label.setForeground(Color.gray);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setForeground(Color.white);
            }
        });
    }

    JLabel Chat_Label = new JLabel();
    JLabel Comunidad_Label = new JLabel();
    JLabel Configuracion_Label = new JLabel();
    JLabel Label_Logo = new JLabel();
}
