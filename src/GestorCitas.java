import java.util.Scanner;

public class GestorCitas {
    public static void GestorCitas() {
        //Variables
        int opcion;

        System.out.println("---------------------------------------------------------");
        System.out.println("\t Concesionario de Autos" +
                            "\n  1.Agendar Cita" +
                            "\n  2.Eliminar Cita");

        Scanner lectura = new Scanner (System.in);
        opcion = lectura.nextInt();
        System.out.println("---------------------------------------------------------");

        switch (opcion){
            case 1:
                InterfazAgendar g1 = new InterfazAgendar();
                g1.InterfazAgendar();;
                break;
            case 2:
                InterfazEliminar g2 = new InterfazEliminar();
                g2.interfazEliminar();
                break;
            default:
                System.out.print("Opcion no valida");
                break;
        }




    }
}
