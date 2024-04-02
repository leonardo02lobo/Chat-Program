package Configuracion;

import utilidades_del_programa.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_Diagonal_De_Configuracion extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Diagonal_De_Configuracion() {
        super.setLayout(null);
        super.setBackground(Variables_Globales.Color);
        super.setSize(too.width / 5, too.height);
        super.setLocation(0, 0);
        init();
    }

    private void init() {
        iniciarLabel(this, Diagonal_Atras, 20, 20, 100, 40, "Volver");
        iniciarLabel(this, Diagonal_Configuracion, getWidth()-150, 20, 150, 40, "Configuracion");
        iniciarLabel(this, Panel_Diagonal_Apariencia, 20, 100, 100, 40, "Aparencia");
        iniciarLabel(this, Panel_Diagonal_Usuario, 20, 150, 100, 40, "Usuario");
        iniciarLabel(this, Panel_Diagonal_Ayuda, 20, 200, 100, 40, "Ayuda");
    }

    private void iniciarLabel(JPanel panel, JLabel label, int x, int y, int ancho, int alto, String texto) {
        label.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 20));
        label.setText(texto);
        label.setForeground(Color.white);
        label.setBounds(x, y, ancho, alto);
        panel.add(label);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    Variables_Globales.tiempo.start();
                    Panel_Configuracion.timer.start();
                if (e.getSource().equals(Diagonal_Atras)) {
                    Variables_Globales.Posicion = 5;
                }else if (e.getSource().equals(Panel_Diagonal_Apariencia)) {
                    Panel_Configuracion.index = 0;
                }else if (e.getSource().equals(Panel_Diagonal_Usuario)) {
                    Panel_Configuracion.index = 1;
                }else if (e.getSource().equals(Panel_Diagonal_Ayuda)) {
                    Panel_Configuracion.index = 2;
                }
            }
        });
    }
    JLabel Panel_Diagonal_Apariencia = new JLabel();
    JLabel Panel_Diagonal_Usuario = new JLabel();
    JLabel Panel_Diagonal_Ayuda = new JLabel();
    JLabel Diagonal_Atras = new JLabel();
    JLabel Diagonal_Configuracion = new JLabel();
}
