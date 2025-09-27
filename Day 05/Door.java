public class Door {
    boolean isOpen;

    Door()
    {
        this.isOpen= false;
        System.out.println("Door has been created");
    }

    void open() {
        this.isOpen = true;
        System.out.println("Door opened");
    }

    void close() {
        this.isOpen = false;
        System.out.println("Door closed");
    }
}
