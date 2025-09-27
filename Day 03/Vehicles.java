interface Vehicle{
    String name = "Car";
    int maxPassanger = 20;
    int maxSpeed = 200;
}

interface LandVehicle extends Vehicle{
    int numWheels = 4;
    void drive();
}

interface SeaVehicle extends Vehicle{
    int displacement = 10;
    void launch();
}


class Car implements LandVehicle {
    public void drive() {
        System.out.println("The max pessangers is "+maxPassanger);
        System.out.println("The max speed is "+maxSpeed);
        System.out.println("The number of wheels is "+numWheels);
        System.out.println("Driving car");
    }
    void stop()
    {
        System.out.println("The car has stopped");
    }
}

class HoverCraft implements LandVehicle,SeaVehicle{
    @Override
    public void launch() {
        System.out.println("The max pessangers is "+maxPassanger);
        System.out.println("The max speed is "+maxSpeed);
        System.out.println("The number of wheels is "+numWheels);
        System.out.println("The displacement is "+displacement);
        System.out.println("Launching hovercraft");
    }
    @Override 
    public void drive() {
        System.out.println("Driving hovercraft");
    }
    void enterLand()
    {
        System.out.println("Entered land");
    }
    void enterSea()
    {
        System.out.println("Entered sea");
    }
}


class Ship implements SeaVehicle{
    @Override
    public void launch() {
        System.out.println("The displacement is "+displacement);
        System.out.println("Launching ship");

    }
    void turn()
    {
        System.out.println("The ship is turning");
    }
}
