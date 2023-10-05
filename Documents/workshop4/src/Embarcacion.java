public class Embarcacion {

    private Capitan cap;
    private double precioBase;
    private double valorAdicional = 20000.0;
    private int anioFabricacion;
    private double eslora;

    public Embarcacion(Capitan cap, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        this.cap = cap;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;

    }

    public double montoAlquiler() {

        if (anioFabricacion > 2020) {
            precioBase = precioBase + valorAdicional;
        }
        return precioBase;
    }
}
