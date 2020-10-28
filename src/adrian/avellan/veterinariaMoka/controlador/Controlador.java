package adrian.avellan.veterinariaMoka.controlador;

import adrian.avellan.veterinariaMoka.bl.entidades.Cita;
import adrian.avellan.veterinariaMoka.bl.entidades.Mascota;
import adrian.avellan.veterinariaMoka.bl.entidades.Reservacion;
import adrian.avellan.veterinariaMoka.bl.entidades.Usuario;
import adrian.avellan.veterinariaMoka.bl.logica.Gestor;
import adrian.avellan.veterinariaMoka.ui.UI;

import java.util.ArrayList;

public class Controlador {

    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 6);

    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarUsuario();
                break;
            case 2:
                resgistrarMascota();
                break;
            case 3:
                sacarCita();
                break;
            case 4:
                registrarReservacion();
                break;
            case 5:
                listarUsuario();
                listarMascotas();
                listarCitas();
                listarReservaciones();
                break;
            case 6:
                interfaz.imprimirMensaje("Gracias por usar la aplicacion");
                break;
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }
    }

    public void registrarUsuario(){

        interfaz.imprimirMensaje("Ingrese su nombre");
        String nombre = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese su numero de cedula");
        String cedula = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese su apellido");
        String apellido = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese su numero de telefono");
        String telefono = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese su direccion");
        String direccion = interfaz.leerTexto();

        interfaz.imprimirMensaje("Indique su estado (activo/inactivo)");
        String estado = interfaz.leerTexto();

        interfaz.imprimirMensaje("Indique su rol (Secretaria/Doctora)");
        String rol = interfaz.leerTexto();

        gestor.agregarUsuario(nombre, cedula, apellido, telefono, direccion, estado, rol);
    }

    public void resgistrarMascota(){

        interfaz.imprimirMensaje("Ingrese el nombre de la Mascota");
        String nombreMascota = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese el nombre del Dueño");
        String nombrePersona = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese el apellido del Dueño");
        String apellidoPersona = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese la cedula del Dueño");
        String cedulaPersona = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese el telefono del Dueño");
        String telefonoPersona = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese la direccion del Dueño");
        String direccionPersona = interfaz.leerTexto();

        interfaz.imprimirMensaje("Digite el nombre del archivo que contiene la foto de la Mascota");
        String fotoMascota = interfaz.leerTexto();

        interfaz.imprimirMensaje("Observaciones o Cuidados particulares de la Mascota");
        String observaciones = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese el ranking de la mascota (1 estrella, 2 estrellas, 3 estrellas)");
        int ranking = Integer.parseInt(interfaz.leerTexto());


        gestor.agregarMascota(nombreMascota, nombrePersona, apellidoPersona, cedulaPersona, telefonoPersona, direccionPersona, fotoMascota, observaciones, ranking);

    }

    public void sacarCita() {

        interfaz.imprimirMensaje("Ingrese el nombre de la Mascota");
        String nombreCitaMascota = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese la fecha de la Cita");
        String fecha = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese la hora de la Cita");
        String hora = interfaz.leerTexto();

        interfaz.imprimirMensaje("Comentarios (Para que es la cita)");
        String comentarios = interfaz.leerTexto();

        gestor.sacarCita(nombreCitaMascota, fecha, hora, comentarios);

    }

    public void registrarReservacion(){

        interfaz.imprimirMensaje("Ingrese el nombre de la Mascota para hacer reservacion");
        String nombreReservaMascota = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese la fecha de entrada");
        String fechaEntrada = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese la fecha de salida");
        String fechaSalida = interfaz.leerTexto();

        gestor.hacerReservacion(nombreReservaMascota, fechaEntrada, fechaSalida);

    }

    private void listarUsuario(){
        ArrayList<Usuario> lista = gestor.listarUsuario();
        interfaz.imprimirMensaje("Lista de Grupos");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }

    private void listarMascotas(){
        ArrayList<Mascota> lista = gestor.listarMascotas();
        interfaz.imprimirMensaje("Lista de Grupos");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }
    private void listarCitas(){
        ArrayList<Cita> lista = gestor.listarCitas();
        interfaz.imprimirMensaje("Lista de Grupos");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }
    private void listarReservaciones(){
        ArrayList<Reservacion> lista = gestor.listarReservaciones();
        interfaz.imprimirMensaje("Lista de Grupos");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }


}
