import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Tecnico {
    private String nombreTecnico;
    private int numeroTecnico;

    public Tecnico(String nombreTecnico, int numeroTecnico) {
        this.nombreTecnico = nombreTecnico;
        this.numeroTecnico = numeroTecnico;
    }

    @Override
    public String toString() {
        return "\n Nombre: " + nombreTecnico + "\n Numero: " + numeroTecnico;
    }


    //Registrar Respaldo: Crear archivo de nuevo tecnico registrado
    public void RegistrarRespaldo(){  //Registro tecnico en el archivo de respaldo
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        try{
            //Crear respaldo de nuevo Tecnico Registrado
            File respaldo = new File("C:\\Users\\Steven\\Desktop\\PersonalConcesionario\\" +
                    this.nombreTecnico.toUpperCase() +".txt");
            w = new FileWriter(respaldo);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            wr.append(toString());
            wr.close();
            bw.close();
            //Informacion Respaldo Creado
            System.out.println("--------------------- Tecnico Resgistrado ------------------------------------");
            System.out.println(toString());
            System.out.println("---------------------------------------------------------");
        }catch(Exception e){
            System.out.println("Error al registrar Respaldo");
        }
    }
}