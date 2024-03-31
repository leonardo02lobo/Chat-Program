package Windows_Home.Setting;

import Utils.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class Panel_Aparencia extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Aparencia() {
        super.setLayout(null);
        super.setBackground(Var_necessary.color);
        super.setSize(too.width - 273, too.height);
        super.setLocation(0, 0);
        init();
    }

    private void init() {
        metodos_Configuracion.iniciarComponentes(this, configuracion_Principal, getWidth() / 2, 20, 200, 30, "Configuracion");
        metodos_Configuracion.iniciarComponentes(this, CambiarColor, 20, 50, 200, 30, "Cambiar Tema");
        iniciarBotones(this, BotonCambiarColor, 20, 100, 200, 30, "Blanco");
        metodos_Configuracion.iniciarComponentes(this, CambiarTexto, 20, 200, 200, 30, "Cambiar Fuente");
        metodos_Configuracion.iniciarComponentes(this, LabelTexto, 20, 250, 200, 30, "Fuente: ");
        iniciarTexto(this, cambiarTexto, 100, 250, 100, 20, "");
        iniciarBoton(this, exportarFuente, 250, 245, 200, 30, "Exportar Fuente");
    }

    private void iniciarBotones(JPanel panel, JToggleButton boton, int x, int y, int ancho, int alto, String texto) {
        boton.setText(texto);
        boton.setBounds(x, y, ancho, alto);
        panel.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (boton.isSelected()) {
                    boton.setText("Negro");
                } else {
                    boton.setText("Blanco");
                }
            }
        });
    }

    private void iniciarBoton(JPanel panel, JButton boton, int x, int y, int ancho, int alto, String texto) {
        boton.setText(texto);
        boton.setBounds(x, y, ancho, alto);
        panel.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser file = new JFileChooser();
                
                file.showOpenDialog(panel);
                File archivo = file.getSelectedFile();
            }
        });
    }

    private void iniciarTexto(JPanel panel, JTextField boton, int x, int y, int ancho, int alto, String texto) {
        boton.setText(texto);
        boton.setBounds(x, y, ancho, alto);
        panel.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Obtener fuente y cambiarla
            }
        });
    }

    JLabel configuracion_Principal = new JLabel();
    JLabel CambiarColor = new JLabel();
    JLabel CambiarTexto = new JLabel();
    JLabel LabelTexto = new JLabel();
    JToggleButton BotonCambiarColor = new JToggleButton();
    JTextField cambiarTexto = new JTextField();
    JButton exportarFuente = new JButton();
}
