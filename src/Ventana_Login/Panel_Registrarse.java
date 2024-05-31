package Ventana_Login;

import utilidades_del_programa.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_Registrarse extends JPanel {

    //constructor que se encarga de cambiar el color y el idioma a esta seccion
    public Panel_Registrarse() {
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
        Metodos_Necesarios_Del_Login.iniciarCajasDeTexto(this, Nombre_Caja, (getWidth() / 2) - 150, (getHeight() / 2) - 200, 300, 30);
        Metodos_Necesarios_Del_Login.iniciarCajasDeTexto(this, Usuario_Caja, (getWidth() / 2) - 150, (getHeight() / 2) - 100, 300, 30);
        Metodos_Necesarios_Del_Login.iniciarCajasDeTexto(this, Contrasenia_Caja, (getWidth() / 2) - 150, (getHeight() / 2), 300, 30);
        iniciarBoton(Boton, (getWidth() / 2) - 80, getHeight() - 150, 150, 30, Palabras_Del_Programa.palabrasLogin[9]);
    }

    //metodo para iniciar los label que cambiaran de idioma y el color del boton
    private void init() {
        Metodos_Necesarios_Del_Login.iniciarLabel(this, Nombre_Label, (getWidth() / 2) - 150, (getHeight() / 2) - 230, 150, 30, Palabras_Del_Programa.palabrasLogin[6]);
        Metodos_Necesarios_Del_Login.iniciarLabel(this, Usuario_Label, (getWidth() / 2) - 150, (getHeight() / 2) - 130, 150, 30, Palabras_Del_Programa.palabrasLogin[7]);
        Metodos_Necesarios_Del_Login.iniciarLabel(this, Contrasenia_Label, (getWidth() / 2) - 150, (getHeight() / 2) - 30, 150, 30, Palabras_Del_Programa.palabrasLogin[8]);
        Metodos_Necesarios_Del_Login.iniciarLabel(this, Advertencia, getWidth() - 350, getHeight() - 50, 400, 30, "");
        Boton.setBackground(Variables_Globales.Color);
        Boton.setForeground(Variables_Globales.ColorLetras);
    }

    //metodo que se encarga de crear el boton y genera un ActionListener que evalua los campos y los manda al metodo del archivo
    private void iniciarBoton(JButton boton, int x, int y, int ancho, int alto, String texto) {
        boton.setBounds(x, y, ancho, alto);
        boton.setText(texto);
        boton.setOpaque(false);
        super.add(boton);
        Panel = this;
        Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Nombre_Caja.getText().equals("") && Usuario_Caja.getText().equals("") && Contrasenia_Caja.getText().equals("")) {
                    Metodos_Necesarios_Del_Login.iniciarLabel(Panel, Advertencia, getWidth() - 350, getHeight() - 50, 400, 30, "Algo salio mal, Intenta nuevamente");
                } else {
                    archivo.Escribir_En_Archivo(Usuario_Caja.getText(), Contrasenia_Caja.getText(), Nombre_Caja.getText());
                    Metodos_Necesarios_Del_Login.iniciarLabel(Panel, Advertencia, getWidth() - 350, getHeight() - 50, 400, 30, "Datos Agregados,Volver al Sign in");
                    limpiar();
                }
            }
        });
    }
    
    //metodo para limpiar los datos
    private void limpiar(){
        Nombre_Caja.setText("");
        Usuario_Caja.setText("");
        Contrasenia_Caja.setText("");
    }
    
    //variables
    Metodos_De_Archivos archivo = new Metodos_De_Archivos();
    JLabel Nombre_Label = new JLabel();
    JTextField Nombre_Caja = new JTextField();
    JLabel Usuario_Label = new JLabel();
    JTextField Usuario_Caja = new JTextField();
    JLabel Contrasenia_Label = new JLabel();
    JPasswordField Contrasenia_Caja = new JPasswordField();
    JButton Boton = new JButton();
    JLabel Advertencia = new JLabel();
    JPanel Panel = new JPanel();
}
