public class Velero extends Embarcacion implements Validacion {
    private int cantMastiles;

    public Velero(Capitan cap, double precioBase, double valorAdicional, int anioFabricacion, double eslora,
            int cantMastiles) {
        super(cap, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantMastiles = cantMastiles;
    }

    @Override
    public void validar() {
        if (cantMastiles > 4) {
            System.out.println("El velero es grande");
        } else {
            System.out.println("El velero es pequeño");
        }
    }
}