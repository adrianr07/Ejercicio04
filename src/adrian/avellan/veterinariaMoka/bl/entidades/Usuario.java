/**
 * @author: Adrian Avellan
 * @version: 1.0
 *
 *
 */

package adrian.avellan.veterinariaMoka.bl.entidades;

public class Usuario {

    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String direccion;
    private String estado;
    private String rol;

    /**
     *
     * @return nombre del usuario de la plataforma
     */

    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre registro del usuario
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return apellido del usuario del a plataforma
     */

    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido registro del apellido del usuario
     */

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return cedula del usuario de la plataforma
     */

    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula cedula del usuario
     */

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @return telefono del usuario de la plataform
     */

    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono registro del telefono del usuario
     */

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return direccion del usuario de la plataforma
     */

    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion registro de la direccion del usuario
     */

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return estado(activo/ inactivo) del usuario de la plataforma
     */

    public String getEstado() {
        return estado;
    }

    /**
     *
     * @param estado registro del estado(activo/ inactivo) del usario
     */

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     *
     * @return rol del usuario de la plataforma
     */

    public String getRol() {
        return rol;
    }

    /**
     *
     * @param rol registro del rol del usuario
     */

    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Constructor Vacio
     * @param nuevoUsuario
     */

    public Usuario(Usuario nuevoUsuario) {
    }

    /**
     * Constructor con todos los parametros necesarios para registrar al usuario de la plataforma
     * @param nombre
     * @param apellido
     * @param cedula
     * @param telefono
     * @param direccion
     * @param estado
     * @param rol
     */

    public Usuario(String nombre, String apellido, String cedula, String telefono, String direccion, String estado, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estado='" + estado + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
