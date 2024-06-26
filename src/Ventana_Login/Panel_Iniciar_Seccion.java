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

    //constructor que inicializa el lenguaje de la aplicacion y el sistema de Login
    //este metood contiene un Timer para cambiar el color y el idioma 
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

    //metodo encargado de iniciarlizar los componentes que cambiaran 
    private void init() {
        Metodos_Necesarios_Del_Login.iniciarLabel(this, Usuario_Label, (getWidth() / 2) - 150, getHeight() - 430, 150, 30, Palabras_Del_Programa.palabrasLogin[2]);
        Metodos_Necesarios_Del_Login.iniciarLabel(this, Contrasenia_Label, (getWidth() / 2) - 150, getHeight() - 330, 150, 30, Palabras_Del_Programa.palabrasLogin[3]);
        Boton_Iniciar_Seccion.setBackground(Variables_Globales.Color);
        Boton_Iniciar_Seccion.setForeground(Variables_Globales.ColorLetras);
    }

    //metodo que inicializa el boton y genera un ActionListener que se encarga de iniciar el otro panel si los datos estan
    //escritos de manera correcta
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

    //metodo que se encarga de crear la nueva ventana donde estara el chat
    private void OpenWindow() {
        JFrame Ventana = new JFrame();
        Ventana_Inicio window = new Ventana_Inicio();
        App app = new App();
        Ventana.add(window);
        Ventana.pack();
        Ventana.setIconImage(app.icono);
        Ventana.setTitle("Chat Para Programadores");
        Ventana.setSize(too);
        Ventana.setResizable(true);
        Ventana.setLocationRelativeTo(null);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }
    
    //este metodo se encarga de limpiar las casillas de texto y quitar el check
    private void LimpiarCasillas(){
        Usuario.setText("");
        Contrasenia.setText("");
        Licencia_Inicio_Seccion.setSelected(false);
    }

    //variables
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
