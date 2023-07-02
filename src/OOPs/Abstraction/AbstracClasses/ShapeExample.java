package OOPs.Abstraction.AbstracClasses;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        Shape s1;
        s1 = new Rectangle();
        s1.draw();
        s1 = new Circle();
        s1.draw();

    }
}
