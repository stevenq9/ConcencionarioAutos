import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class InterfazEliminar {

    //Atributos
    private CitaMecanica cita = new CitaMecanica();
    Scanner lectura = new Scanner(System.in);
    private int IDCita;
    private int opcion;

    //Metodos
    File respaldo;

    public void solicitarDatos() {
        JOptionPane.showMessageDialog(null, "Ingrese cuidadosamente los datos requeridos para eliminar la cita");
    }

    public void EliminarCita(int citaID) {
        try {
            File archivo = new File(cita.nombreArchivoCita(citaID));
            if (archivo.delete()) {
                System.out.println("Cita eliminada exitosamente");
            }
        } catch (Exception e) {

        }
    }



    public boolean ComprobarExistencia(int citaID) {
        File archivo;
        FileReader fr;
        BufferedReader br;

        try {
            archivo = new File(cita.nombreArchivoCita(citaID));
            if (archivo.exists()) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("No se encontró registros para la cita especificada");
        }

        return false;
    }

    public void interfazEliminar() {
        System.out.println("---------------------------------------------------------");
        System.out.println("\t Eliminar Cita");
        System.out.println("Informacion Cita");
        System.out.println("\tID Cita:");
        IDCita = lectura.nextInt();
        System.out.println("1. Eliminar Cita "
                + "\n2. Volver");
        opcion = lectura.nextInt();

        switch (opcion) {
            case 1:
                if (ComprobarExistencia(IDCita)) {
                    EliminarCita(IDCita);
                    System.out.println("La cita se eliminó de manera correcta");
                    System.out.println("1. Salir");
                    opcion = lectura.nextInt();
                    switch (opcion) {
                        case 1:
                            GestorCitas g1 = new GestorCitas();
                            g1.Menu();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }

                } else {
                    System.out.println("Error: La cita ingresada no existe");
                    System.out.println("1. Salir");
                    opcion = lectura.nextInt();
                    switch (opcion) {
                        case 1:
                            GestorCitas g1 = new GestorCitas();
                            g1.Menu();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;
                }
                break;
            case 2:
                GestorCitas g1 = new GestorCitas();
                g1.Menu();
                break;
            default:
                System.out.print("Opcion no valida");
                break;

        }
    }
}

