package Ventana_Login;

import Ventana_De_Inicio.Ventana_Inicio;
import Principal.*;
import utilidades_del_programa.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

public class Panel_Iniciar_Seccion extends JPanel {

    public Panel_Iniciar_Seccion() {
        Ventana_Login.iniciarLenguajeLogin();
        super.setLayout(null);
        super.setSize(400, 500);
        Timer tiempo = new Timer(1000/60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Variables_Globales.Color);
                init();
            }
        });
        tiempo.start();
        super.setLocation(290, 160);
        iniciarBoton(Boton_Iniciar_Seccion, (getWidth() / 2) - 80, getHeight() - 150, 150, 30, Palabras_Del_Programa.palabrasLogin[5]);
        Metodos_Necesarios_Del_Login.iniciarCajasDeTexto(this, Usuario, (getWidth() / 2) - 150, getHeight() - 400, 300, 30);
        Metodos_Necesarios_Del_Login.iniciarCajasDeTexto(this, Contrasenia, (getWidth() / 2) - 150, getHeight() - 300, 300, 30);
        Metodos_Necesarios_Del_Login.iniciarCheck(this, Licencia_Inicio_Seccion, (getWidth() / 2) - 150, getHeight() - 200, 250, 30, Palabras_Del_Programa.palabrasLogin[4]);
    }

    private void init() {
        Metodos_Necesarios_Del_Login.iniciarLabel(this, Usuario_Label, (getWidth() / 2) - 150, getHeight() - 430, 150, 30, Palabras_Del_Programa.palabrasLogin[2]);
        Metodos_Necesarios_Del_Login.iniciarLabel(this, Contrasenia_Label, (getWidth() / 2) - 150, getHeight() - 330, 150, 30, Palabras_Del_Programa.palabrasLogin[3]);
        Boton_Iniciar_Seccion.setBackground(Variables_Globales.Color);
        Boton_Iniciar_Seccion.setForeground(Variables_Globales.ColorLetras);
    }

    private void iniciarBoton(JButton boton, int x, int y, int ancho, int alto, String texto) {
        boton.setBounds(x, y, ancho, alto);
        boton.setText(texto);
        boton.setOpaque(false);
        super.add(boton);
        panel = this;
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String usuario = Usuario.getText();
                    String contrasenia = Contrasenia.getText();
                    Metodos_De_Archivos archivo = new Metodos_De_Archivos();
                    archivo.setDatos(usuario, contrasenia);
                    archivo.Leer_El_Archivo();
                    if ((Licencia_Inicio_Seccion.isSelected()) && band) {
                        LimpiarCasillas();
                        OpenWindow();
                    } else {
                        Metodos_Necesarios_Del_Login.iniciarLabel(panel, advertencia, getWidth()-350, getHeight()-100, 350, 30, "Algo salio mal, Intenta nuevamente");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Panel_Iniciar_Seccion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void OpenWindow() {
        Ventana_Inicio window = new Ventana_Inicio();
        App app = new App();
        App.Ventana2.add(window);
        App.Ventana2.pack();
        App.Ventana2.setIconImage(app.icono);
        App.Ventana2.setTitle("Chat Para Programadores");
        App.Ventana2.setSize(too);
        App.Ventana2.setResizable(true);
        App.Ventana2.setLocationRelativeTo(null);
        App.Ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App.Ventana2.setVisible(true);
        App.Ventana.dispose();
    }
    
    private void LimpiarCasillas(){
        Usuario.setText("");
        Contrasenia.setText("");
        Licencia_Inicio_Seccion.setSelected(false);
    }

    public static boolean band = false;
    Dimension too = super.getToolkit().getScreenSize();
    JLabel iniciarSesion = new JLabel();
    JLabel Registrarte = new JLabel();
    JLabel Usuario_Label = new JLabel();
    JTextField Usuario = new JTextField();
    JLabel Contrasenia_Label = new JLabel();
    JPasswordField Contrasenia = new JPasswordField();
    JCheckBox Licencia_Inicio_Seccion = new JCheckBox();
    JButton Boton_Iniciar_Seccion = new JButton();
    JLabel linea = new JLabel();
    JLabel advertencia = new JLabel();
    JPanel panel = new JPanel();
}
