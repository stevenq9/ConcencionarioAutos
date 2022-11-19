public class CitaMecanica {
    private int citaID;
    private String fecha;
    private String informacionCita;
    private String informacionCliente;
    private String informacionVehiculo;
    private String informacionTecnico;


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
                "\nInformacion Tecnico: " + informacionTecnico;
    }
}
