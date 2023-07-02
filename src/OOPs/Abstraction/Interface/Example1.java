package OOPs.Abstraction.Interface;

interface Printable {
    void print();
}

class Print implements Printable {
    public void print() {
        System.out.println("Hello");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Print print = new Print();
        print.print();
    }
}
