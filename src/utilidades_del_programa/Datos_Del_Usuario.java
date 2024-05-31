package utilidades_del_programa;

public class Datos_Del_Usuario {
    //atributos de un usuario
    private String nombre;
    private String usuario;
    private String contrasenia;

    //metodo getter de nombre
    public String getNombre() {
        return nombre;
    }

    //metodo setter de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo getter de usuario
    public String getUsuario() {
        return usuario;
    }

    //metodo setter de usuario
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //metodo getter de contraseña
    public String getContrasenia() {
        return contrasenia;
    }

    //metodo setter de contraseña
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
