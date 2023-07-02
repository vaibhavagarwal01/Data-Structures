package OOPs.Abstraction.Interface;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class DrawingShape {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();

        shape = new Circle();
        shape.draw();
    }

}