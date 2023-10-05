public class Main {
    public static void main(String[] args) {
        Capitan capVelero = new Capitan("Juan", "Perez", "12345");
        Velero vel = new Velero(capVelero, 1000.0, 20000.0, 2022, 15.0, 5);

        Capitan capYate = new Capitan("Maria", "Lopez", "67890");
        Yate yate = new Yate(capYate, 2000.0, 20000.0, 2019, 20.0, 8);

        vel.validar();
        yate.validar();

        System.out.println("Monto de alquiler del Velero: $" + vel.montoAlquiler());
        System.out.println("Monto de alquiler del Yate: $" + yate.montoAlquiler());
    }
}