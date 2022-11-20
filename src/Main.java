import java.util.Scanner;

public class Main {
    //Métodos
    public static void EjecutarGestorCitas(){
        GestorCitas g1 = new GestorCitas();
        g1.Menu();
    }
    public static void EjecutarGestorPersonal(){
        GestorPersonal g2 = new GestorPersonal();
        g2.Menu();
    }



    public static void main(String[] args){
        System.out.println("---------------------------------------------------------");
        System.out.println("\t Concesionario de Autos" +
                "\n  1.Gestor Personal" +
                "\n  2.Gestor Citas");

        Scanner lectura = new Scanner (System.in);
        System.out.print("Ingrese la opcion requerida: ");
        int opcion = lectura.nextInt();
        switch (opcion){
            case 1:
                //Gestor Personal
                EjecutarGestorPersonal();
                break;
            case 2:
                //Gestor Citas
                EjecutarGestorCitas();
                break;
            default:
                System.out.print("Opcion no valida");
                break;
        }
        System.out.println("---------------------------------------------------------");

    }
}
