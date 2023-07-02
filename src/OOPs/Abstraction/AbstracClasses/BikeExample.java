package OOPs.Abstraction.AbstracClasses;

abstract class Bikee {
    abstract void run();
}

class Honda extends Bikee {
    void run() {
        System.out.println("Bike running safely");
    }
}

public class BikeExample {
    public static void main(String[] args) {
        Bikee bike = new Honda();
        bike.run();
    }
}
