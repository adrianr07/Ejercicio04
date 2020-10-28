package adrian.avellan.veterinariaMoka.bl.logica;

import adrian.avellan.veterinariaMoka.bl.entidades.Cita;
import adrian.avellan.veterinariaMoka.bl.entidades.Mascota;
import adrian.avellan.veterinariaMoka.bl.entidades.Reservacion;
import adrian.avellan.veterinariaMoka.bl.entidades.Usuario;

import java.util.ArrayList;

public class Gestor {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Mascota> mascotas;
    private ArrayList<Cita> citas;
    private ArrayList<Reservacion> reservaciones;

    public Gestor(){

        this.usuarios = new ArrayList<>();
        this.mascotas = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.reservaciones = new ArrayList<>();
    }

    public void agregarUsuario(String nombre, String cedula, String apellido, String telefono, String direccion, String estado, String rol){
        Usuario nuevo = new Usuario(nombre, cedula, apellido, telefono, direccion, estado, rol);
        usuarios.add(nuevo);
    }

    public void agregarMascota(String nombreMascota,String nombrePersona, String apellidoPersona, String cedulaPersona, String telefonoPersona, String direccionPersona, String fotoMascota,String observaciones, int ranking){
        Mascota nueva = new Mascota(nombreMascota, nombrePersona, apellidoPersona, cedulaPersona, telefonoPersona, direccionPersona, fotoMascota, observaciones, ranking);
        mascotas.add(nueva);
    }

    public void sacarCita(String nombreCitaMascota,String fecha,int hora,String comentarios){
        Cita nueva = new Cita(nombreCitaMascota, fecha, hora, comentarios);
        citas.add(nueva);
    }

    public void hacerReservacion(String nombreReservaMascota,String fechaEntrada,String fechaSalida){
        Reservacion nueva = new Reservacion(nombreReservaMascota, fechaEntrada, fechaSalida);
        reservaciones.add(nueva);
    }

    public ArrayList<Usuario> listarUsuario(){
        return this.usuarios;
    }
    public ArrayList<Mascota> listarMascotas(){
        return this.mascotas;
    }
    public ArrayList<Cita> listarCitas(){
        return this.citas;
    }
    public ArrayList<Reservacion> listarReservaciones(){
        return this.reservaciones;
    }

}
