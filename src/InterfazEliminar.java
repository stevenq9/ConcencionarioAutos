import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class InterfazEliminar {

    //Atributos
    Scanner lectura = new Scanner(System.in);
    int IDCita;
    int opcion;

    //Metodos
    File respaldo;
    private JTextField txtID;

    public void solicitarDatos() {
        JOptionPane.showMessageDialog(null, "Ingrese cuidadosamente los datos requeridos para eliminar la cita");
    }

    public void EliminarCita(int citaID) {
        try {
            File archivo = new File(nombreArchivoCita(citaID));
            if (archivo.delete()) {
                System.out.println("Cita eliminada exitosamente");
            }
        } catch (Exception e) {

        }
    }

    //Método para formar el nombre del archivo de la cita a EliminarA
    public String nombreArchivoCita(int citaID){
        return "C:\\Users\\Steven\\Desktop\\CitaID" + citaID + ".txt";
    }


    public boolean ComprobarExistencia(int citaID) {
        File archivo;
        FileReader fr;
        BufferedReader br;

        try {
            archivo = new File(nombreArchivoCita(citaID));
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

