public class Cliente {
    //Atributos
    String nombreCliente;
    int CICliente;
    int numeroCliente;
    String direccion;

    //Constructor
    public Cliente (String nombreCliente, int CICliente, int numeroCliente, String direccion) {
        this.nombreCliente = nombreCliente;
        this.CICliente = CICliente;
        this.numeroCliente = numeroCliente;
        this.direccion = direccion;
    }

    //toString
    public String toString() {
        return
                "\n Nombre: " + this.nombreCliente
                        + "\n CI: " + this.direccion
                        + "\n Número: " + this.numeroCliente
                        + "\n Dirección: " + this.direccion;
    }



}