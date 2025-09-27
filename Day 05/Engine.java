public class Engine {

    boolean isRunning;

    Engine() {
        this.isRunning = false;
        System.out.println("Engine component created");
    }

    void start() {
        if (!isRunning) {

            System.out.println("Engine started");
        } else {
            System.out.println("Engine already running");
        }
    }

    void stop() {
        if (isRunning) {
            this.isRunning = false;
            System.out.println("Engine stopped");
        } else {
            System.out.println("Engine already off");
        }
    }
}
