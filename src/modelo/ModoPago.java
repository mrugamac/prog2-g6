package modelo;

public class ModoPago {

    // Atributos del modo de pago
    private int numPago;
    private String nombre;
    private String otrosDetalles;

    // Constructor vacío
    public ModoPago() {
    }

    // Constructor con todos los atributos
    public ModoPago(int numPago, String nombre, String otrosDetalles) {
        this.numPago = numPago;
        this.nombre = nombre;
        this.otrosDetalles = otrosDetalles;
    }

    // Métodos getters y setters para cada atributo

    public int getNumPago() {
        return numPago;
    }

    public void setNumPago(int numPago) {
        this.numPago = numPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOtrosDetalles() {
        return otrosDetalles;
    }

    public void setOtrosDetalles(String otrosDetalles) {
        this.otrosDetalles = otrosDetalles;
    }
}
