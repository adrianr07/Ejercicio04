/**
 * @author: Adrian Avellan
 * @version: 1.0
 *
 *
 */

package adrian.avellan.veterinariaMoka.bl.entidades;

public class Mascota {

    private String nombreMascota;
    private String nombrePersona;
    private String apellidoPersona;
    private String cedulaPersona;
    private String telefonoPersona;
    private String direccionPersona;
    private String fotoMascota;
    private String observaciones;
    private int ranking; //1, 2, 3 estrellas


    /**
     *
     * @return nombre de la mascota a registrar
     */
    public String getNombreMascota() {
        return nombreMascota;
    }

    /**
     *
     * @param nombreMascota nombre de la mascota registrada
     */

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    /**
     *
     * @return nombre del dueño de la mascota
     */

    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     *
     * @param nombrePersona registro del nombre del dueño
     */

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    /**
     *
     * @return apellido del dueño de la mascota
     */

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    /**
     *
     * @param apellidoPersona registro del apellido del dueño
     */

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    /**
     *
     * @return cedula del dueño de la mascota
     */

    public String getCedulaPersona() {
        return cedulaPersona;
    }

    /**
     *
     * @param cedulaPersona registro de la cedula del dueño
     */

    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    /**
     *
     * @return telefono del dueño de la mascota
     */

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    /**
     *
     * @param telefonoPersona registro del telefono del dueño
     */

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    /**
     *
     * @return direccion del dueño de la mascota
     */

    public String getDireccionPersona() {
        return direccionPersona;
    }

    /**
     *
     * @param direccionPersona registro de la direccion del dueño
     */

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    /**
     *
     * @return foto de la mascota
     */

    public String getFotoMascota() {
        return fotoMascota;
    }

    /**
     *
     * @param fotoMascota registro de la foto de la mascota
     */

    public void setFotoMascota(String fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    /**
     *
     * @return observaciones y comentarios sobre la mascota
     */

    public String getObservaciones() {
        return observaciones;
    }

    /**
     *
     * @param observaciones registro de los comentarios sobre la mascota
     */

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     *
     * @return ranking de la mascota en estrellas
     */

    public int getRanking() {
        return ranking;
    }

    /**
     *
     * @param ranking registro del ranking de la mascota
     */

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    /**
     * Constructor Vacio
     * @param nuevaMascota
     */

    public Mascota(Mascota nuevaMascota) {
    }

    /**
     * Constructor con todos los parametros necesarios para registrar mascota
     * @param nombreMascota
     * @param nombrePersona
     * @param apellidoPersona
     * @param cedulaPersona
     * @param telefonoPersona
     * @param direccionPersona
     * @param fotoMascota
     * @param observaciones
     * @param ranking
     */

    public Mascota(String nombreMascota, String nombrePersona, String apellidoPersona, String cedulaPersona, String telefonoPersona, String direccionPersona, String fotoMascota, String observaciones, int ranking) {
        this.nombreMascota = nombreMascota;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.cedulaPersona = cedulaPersona;
        this.telefonoPersona = telefonoPersona;
        this.direccionPersona = direccionPersona;
        this.fotoMascota = fotoMascota;
        this.observaciones = observaciones;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombreMascota='" + nombreMascota + '\'' +
                ", nombrePersona='" + nombrePersona + '\'' +
                ", apellidoPersona='" + apellidoPersona + '\'' +
                ", cedulaPersona='" + cedulaPersona + '\'' +
                ", telefonoPersona='" + telefonoPersona + '\'' +
                ", direccionPersona='" + direccionPersona + '\'' +
                ", fotoMascota='" + fotoMascota + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}
