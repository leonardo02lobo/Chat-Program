package Ventana_De_Inicio;

import utilidades_del_programa.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_Diagonal extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Diagonal() {
        super.setLayout(null);
        super.setLocation(0, 0);
        super.setSize(365, too.height);
        super.add(new Apartado_Contenido_Chat());
        Timer tiempo = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarIdiomaInicio();
                setBackground(Variables_Globales.Color);
                init();
            }
        });
        tiempo.start();
    }

    private void init() {
        iniciarLabel((getWidth() / 2) - 150, 90, 50, 30, Chat_Label, Palabras_Del_Programa.palabrasInicio[0]);
        iniciarLabel(getWidth() / 2, 90, 150, 30, Comunidad_Label, Palabras_Del_Programa.palabrasInicio[1]);
        iniciarLabel(getWidth() - 100, 20, 100, 50, Configuracion_Label, Palabras_Del_Programa.palabrasInicio[2]);
        iniciarLabel(getWidth() - 355, 20, 150, 50, Label_Logo, "Chat Programer");
    }

    private void iniciarLabel(int x, int y, int ancho, int alto, JLabel label, String texto) {
        label.setText(texto);
        label.setBounds(x, y, ancho, alto);
        label.setForeground(Variables_Globales.ColorLetras);
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
        });
    }

    public static void cambiarIdiomaInicio() {
        Palabras_Del_Programa.pantalla = "inicio";
        if (Variables_Globales.CambiarIdioma == 0) {
            Palabras_Del_Programa.ObtenerArchivo("src/archivos/inicio-español.txt");
        }else if (Variables_Globales.CambiarIdioma == 1) {
            Palabras_Del_Programa.ObtenerArchivo("src/archivos/inicio-ingles.txt");
        }
    }

    JLabel Chat_Label = new JLabel();
    JLabel Comunidad_Label = new JLabel();
    JLabel Configuracion_Label = new JLabel();
    JLabel Label_Logo = new JLabel();
}
