package Configuracion;

import utilidades_del_programa.Metodos_Configuracion;
import utilidades_del_programa.Variables_Globales;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_Aparencia extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Aparencia() {
        super.setLayout(null);
        super.setBackground(Variables_Globales.Color);
        super.setSize(too.width - 273, too.height);
        super.setLocation(0, 0);
        init();
    }

    private void init() {
        Metodos_Configuracion.iniciarComponentes(this, configuracion_Principal, getWidth() / 2, 20, 200, 30, "Configuracion");
        Metodos_Configuracion.iniciarComponentes(this, CambiarColor, 20, 100, 200, 30, "Cambiar Tema");
        iniciarBotones(this, BotonCambiarColor, getWidth()-250, 100, 200, 30, "Blanco");
    }

    private void iniciarBotones(JPanel panel, JToggleButton boton, int x, int y, int ancho, int alto, String texto) {
        boton.setText(texto);
        boton.setBounds(x, y, ancho, alto);
        panel.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Variables_Globales.tiempo.start();
                if (boton.isSelected()) {
                    boton.setText("Negro");
                    Variables_Globales.Color = new Color(255, 255, 255);
                } else {
                    boton.setText("Blanco");
                    Variables_Globales.Color = new Color(10, 15, 20);
                }
            }
        });
    }
    
    JLabel configuracion_Principal = new JLabel();
    JLabel CambiarColor = new JLabel();
    JToggleButton BotonCambiarColor = new JToggleButton();
    JLabel CambiarIdioma = new JLabel();
}
