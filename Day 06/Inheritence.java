class Engine{
    void start()
    {
        System.out.println("The engine has started");
    }
}
class Tyre extends Engine{
    void roll()
    {
        System.out.println("The time is rolling");
    }
}
class Door extends Tyre{
    void open()
    {
        System.out.println("The door is opening");
    }
}

class Car extends Door{
    void go()
    {
        System.out.println("The car is moving");
    }

}
public class Inheritence {
    public static void main(String[] args) {
        Car c1 = new Car();
    }
}
