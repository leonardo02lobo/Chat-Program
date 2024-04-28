package utilidades_del_programa;

import Ventana_Login.*;
import java.io.*;

public class Metodos_De_Archivos {

    File archivo = new File("database.txt");
    int contador = 0;
    String usuario, contrasenia;
    public static String Dataname = "";
    Datos_Del_Usuario user = new Datos_Del_Usuario();

    public void setDatos(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public void Escribir_En_Archivo(String escribir_usuario, String escribir_contrasenia, String escribir_nombre) {
        try {
            FileWriter Escribir_Archivo = new FileWriter(archivo, true);
            Escribir_Archivo.write(escribir_nombre + ";" + escribir_usuario + ";" + escribir_contrasenia + "\n");
            Escribir_Archivo.close();
        } catch (IOException ex) {
            System.out.println("No se pudo escribir en el archivo");
        }
    }

    public void Leer_El_Archivo() throws IOException {
        try {
            FileReader leer = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(leer);

            String datos = "";
            String palabra = lector.readLine();
            while (palabra != null) {
                datos += palabra + "\n";
                palabra = lector.readLine();
                contador++;
            }
            tokens1(datos);
        } catch (FileNotFoundException ex) {
            System.out.println("No se pudo leer en el archivo");
        }
    }

    public void tokens1(String datos) {
        for (int i = 0; i < contador; i++) {
            String palabras[] = datos.split("\n");
            tokens2(palabras[i]);
        }
    }

    public void tokens2(String date2) {
        for (int i = 0; i < contador / 2; i++) {
            String[] word2 = date2.split(";");
            user.setNombre(word2[0]);
            user.setUsuario(word2[1]);
            user.setContrasenia(word2[2]);
            ValiditySesion(user.getUsuario(), user.getContrasenia(), user.getNombre());
        }
    }

    public void ValiditySesion(String user, String password, String name) {

        if (user.equals(usuario) && password.equals(contrasenia)) {
            Dataname = name;
            Panel_Iniciar_Seccion.band = true;
        }
    }
}
