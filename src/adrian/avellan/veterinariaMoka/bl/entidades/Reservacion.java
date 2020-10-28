/**
 * @author: Adrian Avellan
 * @version: 1.0
 *
 *
 */


package adrian.avellan.veterinariaMoka.bl.entidades;

public class Reservacion {

    private String nombreReservaMascota;
    private String fechaEntrada;
    private String fechaSalida;

    /**
     *
     * @return nombre de la mascota que va a realizar una reservacion en la veterinaria
     */

    public String getNombreReservaMascota() {
        return nombreReservaMascota;
    }

    /**
     *
     * @param nombreReservaMascota registro del nombre de la mascota para la reservacion
     */

    public void setNombreReservaMascota(String nombreReservaMascota) {
        this.nombreReservaMascota = nombreReservaMascota;
    }

    /**
     *
     * @return fecha de entrada para la reservacion
     */

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     *
     * @param fechaEntrada registro de entrada para la reservacion
     */

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     *
     * @return fehca de salida para la reservacion
     */

    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     *
     * @param fechaSalida registro de la salida de la reservacion
     */

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Constructor Vacio
     * @param nuevaReservacion
     */

    public Reservacion(Reservacion nuevaReservacion) {
    }

    /**
     * Constructor con todos los parametros necesarios para registrar la reservacion
     * @param nombreReservaMascota
     * @param fechaEntrada
     * @param fechaSalida
     */

    public Reservacion(String nombreReservaMascota, String fechaEntrada, String fechaSalida) {
        this.nombreReservaMascota = nombreReservaMascota;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "nombreReservaMascota='" + nombreReservaMascota + '\'' +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                '}';
    }
}
