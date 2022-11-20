import java.io.File;
import java.util.Scanner;

public class GestorPersonal {
    //Atributos
    private Tecnico tecnico;
    private String nombreTecnico;
    private int numeroTecnico;

    //Scanner para lectura de datos
    Scanner lectura = new Scanner (System.in);

    //Métodos

    //Registro Personal
    public void RegistrarTecnico(){
        //Ingreso de datos del nuevo Tecnico
        System.out.println("\t Registrar Tecnico ");
        System.out.println("Ingrese el apellido del técnico:");
        nombreTecnico = lectura.next();
        System.out.println("Ingrese el nombre del técnico:");
        nombreTecnico += lectura.next();
        System.out.println("Ingrese el numero telefonico del técnico:");
        numeroTecnico = lectura.nextInt();
        tecnico = new Tecnico(nombreTecnico.toUpperCase(), numeroTecnico); //Registro del tecnico
    }

    //Eliminar Tecnico
    public void EliminarTecnico(String nombreTecnico){
        try {
            File archivo = new File("C:\\Users\\Steven\\Desktop\\PersonalConcesionario\\"
                    + nombreTecnico.toUpperCase() +".txt");
            if (archivo.delete()) {
                System.out.println("Tecnico eliminado Correctamente");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar");

        }
    }

    //Menu
    public void Menu(){
        int opcion=0;
        while (opcion != 3) {

        System.out.println("---------------------------------------------------------");
        System.out.println("\t Concesionario de Autos - Gestor Personal" +
                "\n  1.Registrar Tecnico" +
                "\n  2.Eliminar Tecnico"+
                "\n  3.Salir")
        ;

        Scanner lectura = new Scanner (System.in);
        System.out.print("Ingrese la opcion requerida: ");
        opcion = lectura.nextInt();
        System.out.println("---------------------------------------------------------");


            switch (opcion){
                case 1:                //Registro Tecnico
                    RegistrarTecnico();
                    tecnico.RegistrarRespaldo();
                    break;
                case 2:  //Eliminar Tecnico
                    System.out.println("Eliminar Tecnico ");
                    System.out.println("Ingrese el apellido del técnico a eliminar:");
                    nombreTecnico = lectura.next();
                    System.out.println("Ingrese el nombre del técnico a eliminar:");
                    nombreTecnico += lectura.next();
                    EliminarTecnico(nombreTecnico);
                    break;
                case 3:  //Salir
                    break;
                default:
                    System.out.print("Opcion no valida");
                    break;
            }
        }

    }


}
