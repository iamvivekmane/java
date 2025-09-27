public class VehiclesTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.drive();
        c1.stop();
        System.out.println("--------------");
        HoverCraft h1 = new HoverCraft();
        h1.launch();
        h1.drive();
        h1.enterLand();
        h1.enterSea();
        System.out.println("--------------");
        Ship s1 = new Ship();
        s1.launch();
        s1.turn();
    }
}
