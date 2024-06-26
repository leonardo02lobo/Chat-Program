package Configuracion;

import Ventana_De_Inicio.Panel_Diagonal_Busqueda;
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
        super.setSize(too.width - 273, too.height);
        super.setLocation(0, 0);
        Timer tiempo = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarComponentes();
                setBackground(Variables_Globales.Color);
            }
        });
        tiempo.start();
        init();
    }

    private void init() {
        iniciarBotones(this, BotonCambiarColor, getWidth() - 250, 100, 200, 30, color);
        iniciarComboxBox(this, idiomas, getWidth() - 250, 150, 200, 30);
        iniciarComboxBox(this, apariencia, getWidth() - 250, 200, 200, 30);
    }

    private void iniciarComponentes() {
        Metodos_Configuracion.iniciarComponentes(this, configuracion_Principal, (getWidth() / 2) - 200, 20, 300, 30, Palabras_Del_Programa.palabrasConfiguracion[5]);
        Metodos_Configuracion.iniciarComponentes(this, CambiarColor, 20, 100, 200, 30, Palabras_Del_Programa.palabrasConfiguracion[6]);
        Metodos_Configuracion.iniciarComponentes(this, CambiarIdioma, 20, 150, 200, 30, Palabras_Del_Programa.palabrasConfiguracion[7]);
        Metodos_Configuracion.iniciarComponentes(this, CambiarBarraDeBusqueda, 20, 200, 250, 30, Palabras_Del_Programa.palabrasConfiguracion[8]);
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
                    color = "Negro";
                    boton.setText(color);
                    Variables_Globales.Color = new Color(255, 255, 255);
                    Variables_Globales.ColorLetras = new Color(0, 0, 0);
                } else {
                    color = "Blanco";
                    boton.setText(color);
                    Variables_Globales.Color = new Color(10, 15, 20);
                    Variables_Globales.ColorLetras = new Color(255, 255, 255);
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
                if (e.getSource().equals(idiomas)) {
                    ComboLenguaje(combo);
                } else if (e.getSource().equals(apariencia)) {
                    if (apariencia.getSelectedIndex() == 0) {
                        Panel_Diagonal_Busqueda.band = true;
                    } else if (apariencia.getSelectedIndex() == 1) {
                        Panel_Diagonal_Busqueda.band = false;
                    }
                }
            }
        });
    }

    private void ComboLenguaje(JComboBox combo) {
        Palabras_Del_Programa.pantalla = "configuracion";
        if (combo.getSelectedIndex() == 0) {
            Variables_Globales.CambiarIdioma = 0;
            Palabras_Del_Programa.ObtenerArchivo("src/archivos/configuracion-español.txt");
        } else if (combo.getSelectedIndex() == 1) {
            Variables_Globales.CambiarIdioma = 1;
            Palabras_Del_Programa.ObtenerArchivo("src/archivos/configuracion-ingles.txt");
        }
        init();
    }

    JLabel configuracion_Principal = new JLabel();
    JLabel CambiarColor = new JLabel();
    JToggleButton BotonCambiarColor = new JToggleButton();
    JLabel CambiarIdioma = new JLabel();
    JComboBox idiomas = new JComboBox(new String[]{"Español", "Ingles"});
    JLabel CambiarBarraDeBusqueda = new JLabel();
    JComboBox apariencia = new JComboBox(new String[]{"Solo Texto", "Solo Imagenes"});
    String color = "Blanco";
}
