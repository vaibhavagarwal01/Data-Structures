package OOPs.Abstraction.AbstracClasses;

abstract class Bike {
    int speed;
    Bike() {
        System.out.println("Bike is created");
    }
    Bike(int speed) {
        this.speed = speed;
        System.out.println("Bike is created");
    }

    abstract void run();

    void getSpeed() {
        System.out.println("Speed of the bike is : "+speed);
    }

}

class Ducati extends Bike {
    Ducati() {
        System.out.println("Ducati is created");
    }
    Ducati(int speed) {
        super(speed);
        System.out.println("Ducati is running at the speed of : "+speed);
    }
    void run() {
        System.out.println("Ducati is running safely");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Bike bike = new Ducati();
        bike.run();
        bike.getSpeed();

        bike = new Ducati(150);
        bike.run();
        bike.getSpeed();


    }
}
