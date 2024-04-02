package utilidades_del_programa;

import java.io.*;

public class Palabras_Del_Programa {

    public static void ObtenerArchivo(String archivo_Login_Espaniol) {
        try {
            FileReader lectura = new FileReader(archivo_Login_Espaniol);
            BufferedReader lector = new BufferedReader(lectura);
            String aux = lector.readLine();
            while (aux != null) {
                palabras += aux + ",";
                aux = lector.readLine();
            }
            SepararPalabrasEspaniol();
            palabras = "";
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo");
        }
    }

    public static void SepararPalabrasEspaniol() {
        String[] palabra = palabras.split(",");
        for (int i = 0; i < palabra.length; i++) {
            if (pantalla.equals("configuracion")) {
                palabrasConfiguracion[i] = palabra[i];
            }
        }
    }
    private static String palabras = "";
    public static String pantalla;

    public static String[] palabrasConfiguracion = {
        variables_Configuracion.Volver_Menu, variables_Configuracion.Configuracion_Menu,
        variables_Configuracion.Apariencia_Menu, variables_Configuracion.Usuario_Menu,
        variables_Configuracion.Ayuda_Menu, variables_Configuracion.Apariencia_Configuracion,
        variables_Configuracion.Cambiar_Color_Configuracion,variables_Configuracion.Cambiar_Idioma_Configuracion
    };
    public static String[] palabrasLogin = {
        variables_Login.Iniciar_Sesion, variables_Login.Registrarse, variables_Login.Usuario_IniciarSesion, variables_Login.Contraseña_IniciarSesion,
        variables_Login.Selecciona_para_Iniciar_IniciarSesion, variables_Login.Iniciar_Sesion_IniciarSesion_Boton, variables_Login.Nombre_Registrarse,
        variables_Login.Usuario_Registrarse, variables_Login.Contraseña_Registrarse, variables_Login.Registrarse_Registrarse_Boton
    };
}

class variables_Login {

    public static String Iniciar_Sesion;
    public static String Registrarse;
    public static String Usuario_IniciarSesion;
    public static String Contraseña_IniciarSesion;
    public static String Selecciona_para_Iniciar_IniciarSesion;
    public static String Iniciar_Sesion_IniciarSesion_Boton;
    public static String Nombre_Registrarse;
    public static String Usuario_Registrarse;
    public static String Contraseña_Registrarse;
    public static String Registrarse_Registrarse_Boton;
}

class variables_Configuracion {

    public static String Volver_Menu;
    public static String Configuracion_Menu;
    public static String Apariencia_Menu;
    public static String Usuario_Menu;
    public static String Ayuda_Menu;
    public static String Apariencia_Configuracion;
    public static String Cambiar_Color_Configuracion;
    public static String Cambiar_Idioma_Configuracion;
}
