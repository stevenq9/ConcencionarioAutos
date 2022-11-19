import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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
        tecnico = new Tecnico(nombreTecnico, numeroTecnico); //Registro del tecnico
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
                    //Registro tecnico en el archivo de respaldo
                    FileWriter w;
                    BufferedWriter bw;
                    PrintWriter wr;
                    try{
                        RegistrarTecnico();
                        File respaldo = new File("C:\\Users\\Steven\\Desktop\\PersonalConcesionario\\" + nombreTecnico.toUpperCase() +".txt");
                        w = new FileWriter(respaldo);
                        bw = new BufferedWriter(w);
                        wr = new PrintWriter(bw);
                        wr.append(tecnico.toString());
                        wr.close();
                        bw.close();
                        System.out.println("--------------------- Tecnico Resgistrado ------------------------------------");
                        System.out.println(tecnico.toString());
                        System.out.println("---------------------------------------------------------");

                    }catch(Exception e){
                        System.out.println("Error al registrarTecnico");
                    }
                    break;
                case 2:
                    System.out.println("Eliminar Tecnico ");
                    System.out.println("Ingrese el apellido del técnico a eliminar:");
                    nombreTecnico = lectura.next();
                    System.out.println("Ingrese el nombre del técnico a eliminar:");
                    nombreTecnico += lectura.next();
                    try {
                        File archivo = new File("C:\\Users\\Steven\\Desktop\\PersonalConcesionario\\" + nombreTecnico.toUpperCase() +".txt");
                        if (archivo.delete()) {
                            System.out.println("Tecnico eliminado Correctamente");
                        }
                    } catch (Exception e) {
                        System.out.println("Error al eliminar");

                    }
                    break;
                case 3:
                    System.out.println("");
                    break;
                default:
                    System.out.print("Opcion no valida");
                    break;
            }
        }

    }


}
