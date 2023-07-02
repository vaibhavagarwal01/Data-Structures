package OOPs.Abstraction.Interface;

interface Printabblee {
    void print();
}

interface Showablee {
    void show();
}

public class MutipleInterfaceImplementation implements Printabblee,Showablee {
    public void show() {
        System.out.println("showing Showablee");
    }
    public void print() {
        System.out.println("showing Printabblee");
    }
    public static void main(String[] args) {
        MutipleInterfaceImplementation mi = new MutipleInterfaceImplementation();
        mi.print();
        mi.show();

        //here multiple inheritance is achieved through because the method is implemented by the calling class

    }
}
