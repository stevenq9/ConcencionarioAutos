public class CitaMecanica {
    private int citaID;
    private String fecha;
    private String informacionCita;
    private String informacionCliente;
    private String informacionVehiculo;
    private String informacionTecnico;

    //Constructores
    public CitaMecanica(){};

    public CitaMecanica(int numCita, String fecha, String informacionCita, String informacionCliente, String informacionVehiculo,
                        String informacionTecnico) {
        this.citaID = numCita;
        this.fecha = fecha;
        this.informacionCita = informacionCita;
        this.informacionCliente = informacionCliente;
        this.informacionVehiculo = informacionVehiculo;
        this.informacionTecnico = informacionTecnico;
    }

    public void mostrarInformacion(){
        this.toString();
    }

    //Metodos de acceso
    public String getFecha() {
        return fecha;
    }

    public int getCitaID() {
        return citaID;
    }

    @Override
    public String toString() {
        return "CitaID: " + citaID + "\nInformacion Cita: " + informacionCita +
                "\nInformacion Cliente: " + informacionCliente +
                "\nInformacion Vehiculo: " + informacionVehiculo +
                "\nInformacion Cita: " + informacionCita +
                "\nInformacion Tecnico: " + informacionTecnico;
    }

    //Metodo para encontrar la ruta del archivo de respaldo de una cita
    public String nombreArchivoCita(int citaID){
        return "C:\\Users\\Steven\\Desktop\\CitaID" + citaID + ".txt";
    }
}
