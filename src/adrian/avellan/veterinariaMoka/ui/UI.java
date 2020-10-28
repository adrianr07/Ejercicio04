package adrian.avellan.veterinariaMoka.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void mostrarMenu(){
        output.println("VETERINARIA MOKA");
        output.println("Seleccione una opcion");
        output.println("1. Ingresar Usuario");
        output.println("2. Registrar Mascota");
        output.println("3. Sacar Cita");
        output.println("4. Registrar Reservaciones");
        output.println("5. Listar Registros");
        output.println("6. Salir");
    }

    public int leerOpcion(){
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public void imprimirMensaje(String mensaje){
        output.println(mensaje);
    }

    public String leerTexto(){
        return input.next();
    }

}
