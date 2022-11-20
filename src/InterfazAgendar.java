import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.PrintWriter;

public class InterfazAgendar {
    //Variables
    String date;
    String nombreCliente;
    int cedulaCliente;
    int numeroCliente;
    String direcionCliente;
    String placa;
    int recorrido;
    String marca;
    int year;
    String modelo;
    String Descripcion;
    int numCita = 0;
    String txtAInformacion;

    private Vehiculo vehiculo;
    private Cliente cliente;
    private String fecha;
    private Tecnico tecnico;
    private String descripcionCita;

    //Metodos
    CitaMecanica nuevaCita;
    File respaldo;
    public void AgendarNuevaCita(Vehiculo vehiculo, Cliente cliente, Tecnico tecnico, String descripcionCita){
        nuevaCita = new CitaMecanica(numCita, date, descripcionCita,
                cliente.toString(),
                vehiculo.toString(), tecnico.toString());

        //Regsitro de la cita en el archivo de respaldo
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        String nombre = "C:\\Users\\Steven\\Desktop\\CitaID" + nuevaCita.getCitaID()+".txt";
        try{
            respaldo = new File(nombre);
            w = new FileWriter(respaldo);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);

            wr.write(nuevaCita.getFecha() +"\n");
            wr.append(nuevaCita.toString());
            wr.close();
            bw.close();

            System.out.println(nuevaCita.toString());

        }catch(Exception e){
            System.out.println("Error al almacenar la cita");
        }

    };

    public boolean VerificarDisponibilidad(String date){
        return true;
    }
    public void asignarCliente(){
        cliente = new Cliente(nombreCliente, cedulaCliente, numeroCliente, direcionCliente);
    }

    public void asignarVehiculo(){
        vehiculo = new Vehiculo(placa, recorrido, marca, year, modelo);
    }

    public void asignarTecnico(){
        tecnico = new Tecnico("Ing. Juan Herrera ", Integer.parseInt("0998755215")
        );
    }

    public void solicitarDatos(){
        System.out.println("Ingrese cuidadosamente los datos requeridos para el agendamiento de una cita");
    }

    public void InterfazAgendar(){
        int opcion;

        Scanner lectura = new Scanner (System.in);
        System.out.println("---------------------------------------------------------");
        System.out.println("\t\tAgendar Cita");

        System.out.println("1. Ingrese la fecha de la cita:");
        date = lectura.next();

        System.out.println("2. Datos del Cliente:");
            System.out.println("\t2.1. Nombre:");
            nombreCliente = lectura.next();

            System.out.println("\t2.2. CI:");
            cedulaCliente = lectura.nextInt();

            System.out.println("\t2.3. Numero:");
            numeroCliente= lectura.nextInt();

            System.out.println("\t2.4. Direccion:");
            direcionCliente = lectura.next();

        System.out.println("3. Datos del vehiculo:");

            System.out.println("\t3.1. Placa:");
            placa = lectura.next();

            System.out.println("\t3.2. Recorrido:");
            recorrido = lectura.nextInt();

            System.out.println("\t3.3. Marca:");
            marca = lectura.next();

            System.out.println("\t3.4. Año:");
            year = lectura.nextInt();

            System.out.println("\t3.5. Modelo:");
            modelo = lectura.next();

        System.out.println("4. Descripcion:");
        descripcionCita= lectura.next();

        System.out.println("1. Agendar Cita"
                            + "\n2. Volver");


        opcion = lectura.nextInt();
        System.out.println("---------------------------------------------------------");

        switch (opcion){
            case 1:
                numCita++;
                try{
                    asignarCliente();
                    asignarVehiculo();
                    asignarTecnico();
                    if(VerificarDisponibilidad(date)){
                        AgendarNuevaCita(vehiculo, cliente, tecnico, descripcionCita);
                        System.out.println("Se agendó la cita de manera correcta\n"
                                + "---------------------------------------------------------\n"
                                + nuevaCita.toString()
                                + "\n---------------------------------------------------------");
                    }
                }catch(Exception e1){
                }

                System.out.println("1. Salir");
                opcion = lectura.nextInt();
                switch (opcion){
                    case 1:
                        GestorCitas g1 = new GestorCitas();
                        g1.GestorCitas();
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }

                break;
            case 2:
                GestorCitas g1 = new GestorCitas();
                g1.GestorCitas();
                break;
            default:
                System.out.print("Opcion no valida");
                break;
        }
    }

}
