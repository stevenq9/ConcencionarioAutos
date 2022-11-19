public class Vehiculo {
    //Atributos
    String placa;
    int recorrido;
    String marca;;
    int año;
    String modelo;

    //Constructor
    public Vehiculo (String placa, int recorrido, String marca, int año, String modelo) {
        this.placa = placa;
        this.recorrido = recorrido;
        this.marca = marca;
        this.año = año;
        this.modelo = modelo;
    }

    //toString
    public String toString() {
        return
                "\n Placa: " + this.placa
                        + "\n Recorrido: " + this.recorrido
                        + "\n Marca: " + this.marca
                        + "\n Año: " + this.año
                        + "\n Modelo: " + this.modelo;
    }

}