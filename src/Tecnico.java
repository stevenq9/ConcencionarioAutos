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
}