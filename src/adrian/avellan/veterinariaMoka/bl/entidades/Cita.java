
/**
 * @author: Adrian Avellan
 * @version: 1.0
 *
 *
 */
package adrian.avellan.veterinariaMoka.bl.entidades;

public class Cita {

    private String nombreCitaMascota;
    private String fecha;
    private String hora;
    private String comentarios; //para saber apra que es la cita

    /**
     *
     * @return nombre de la mascota que necesita cita en la veterinaria
     */
    public String getNombreCitaMascota() {
        return nombreCitaMascota;
    }

    /**
     *
     * @param nombreCitaMascota registro de la mascota para una cita
     */

    public void setNombreCitaMascota(String nombreCitaMascota) {
        this.nombreCitaMascota = nombreCitaMascota;
    }

    /**
     *
     * @return fecha en la que se va a atender a la mascota
     */

    public String getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha fecha de registro para la cita
     */

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return hora en la que se va a atender a la mascota
     */

    public String getHora() {
        return hora;
    }

    /**
     *
     * @param hora hora de registro para la cita
     */

    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     *
     * @return comentarios previos para la cita en la veterinaria
     */

    public String getComentarios() {
        return comentarios;
    }

    /**
     *
     * @param comentarios registro de los comentarios
     */

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * Constructor Vacio
     * @param nuevaCita
     */

    public Cita(Cita nuevaCita) {
    }

    /**
     * Constructor con todos los parametros necesarios para registrar una cita en la veterinaria
     * @param nombreCitaMascota
     * @param fecha
     * @param hora
     * @param comentarios
     */

    public Cita(String nombreCitaMascota, String fecha, String hora, String comentarios) {
        this.nombreCitaMascota = nombreCitaMascota;
        this.fecha = fecha;
        this.hora = hora;
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "nombreCitaMascota='" + nombreCitaMascota + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora=" + hora +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
