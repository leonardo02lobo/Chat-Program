package Configuracion;

import utilidades_del_programa.Metodos_Configuracion;
import utilidades_del_programa.Variables_Globales;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import utilidades_del_programa.Palabras_Del_Programa;

public class Panel_Aparencia extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Aparencia() {
        Palabras_Del_Programa.pantalla = "configuracion";
        Palabras_Del_Programa.ObtenerArchivo("src/archivos/configuracion-español.txt");
        super.setLayout(null);
        super.setBackground(Variables_Globales.Color);
        super.setSize(too.width - 273, too.height);
        super.setLocation(0, 0);
        init();
    }

    private void init() {
        Metodos_Configuracion.iniciarComponentes(this, configuracion_Principal, (getWidth() / 2)-200, 20, 300, 30, Palabras_Del_Programa.palabrasConfiguracion[5]);
        Metodos_Configuracion.iniciarComponentes(this, CambiarColor, 20, 100, 200, 30, Palabras_Del_Programa.palabrasConfiguracion[6]);
        iniciarBotones(this, BotonCambiarColor, getWidth() - 250, 100, 200, 30, "Blanco");
        Metodos_Configuracion.iniciarComponentes(this, CambiarIdioma, 20, 150, 200, 30, Palabras_Del_Programa.palabrasConfiguracion[7]);
        iniciarComboxBox(this, idiomas, getWidth() - 250, 150, 200, 30);
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

    private void iniciarComboxBox(JPanel panel, JComboBox combo, int x, int y, int ancho, int alto) {
        combo.setBounds(x, y, ancho, alto);
        panel.add(combo);
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Palabras_Del_Programa.pantalla = "configuracion";
                if (combo.getSelectedIndex() == 0) {
                    Palabras_Del_Programa.ObtenerArchivo("src/archivos/configuracion-español.txt");
                } else if (combo.getSelectedIndex() == 1) {
                    Palabras_Del_Programa.ObtenerArchivo("src/archivos/configuracion-ingles.txt");
                }
                init();
            }
        });
    }

    JLabel configuracion_Principal = new JLabel();
    JLabel CambiarColor = new JLabel();
    JToggleButton BotonCambiarColor = new JToggleButton();
    JLabel CambiarIdioma = new JLabel();
    JComboBox idiomas = new JComboBox(new String[]{"Español", "Ingles"});
}
