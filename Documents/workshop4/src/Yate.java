public class Yate extends Embarcacion implements Validacion {

    private int cantCamarotes;

    public Yate(Capitan cap, double precioBase, double valorAdicional, int anioFabricacion, double eslora,
            int cantCamarotes) {
        super(cap, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public void validar() {
        if (cantCamarotes > 7) {
            System.out.println("Es un yate de lujo");
        } else {
            System.out.println("Es un yate estándar");
        }
    }

}
