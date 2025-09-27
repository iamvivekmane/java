public class Car {
    Engine engine;
    Tyre tyre;
    Door door;
    String brand;

    Car(String brand) {
        this.brand = brand;
        System.out.println(brand + " is assembling a new car");

        this.engine = new Engine();
        this.tyre = new Tyre();
        this.door = new Door();

        System.out.println("Car assembly completed");
    }
    void start()
    {
        System.err.println("Starting "+brand+" car");
        this.engine.start();
    }
    void stop()
    {
        System.err.println("Stopping "+brand+" car");
        this.engine.stop();
    }
}
