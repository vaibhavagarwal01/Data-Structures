package OOPs.Inheritance.SuperKeyword;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class A{
    A(int a) {
        System.out.println("Hello, World from Class A!\n");
    }

    A() {
        System.out.println("Hello, World from Class A empty!\n");
    }
}

class B extends A{
    B(int a) {
        super(a);
        System.out.println("Hello, World from Class B!\n");

    }
}

class SuperKeyWord {
    public static void main(String[] args) {
        B b = new B(12);
    }
}
