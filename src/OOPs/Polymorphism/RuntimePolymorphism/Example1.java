package OOPs.Polymorphism.RuntimePolymorphism;

class Bike {
    void run() {
        System.out.println("Bike running safely");
    }
}
class Splendor extends Bike {
    void run() {
        System.out.println("Splendor running safely at 60 km per hour speed");
    }
        }
public class Example1 {
    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }
}
