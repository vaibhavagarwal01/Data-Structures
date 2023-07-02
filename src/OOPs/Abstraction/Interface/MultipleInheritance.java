package OOPs.Abstraction.Interface;

interface Printablee {
    void show();
}

interface Showable {
    void show();
}

public class MultipleInheritance implements Printablee,Showable {
    public void show() {
        System.out.println("showing something");
    }
    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.show();
        //here multiple inheritance is achieved through because the method is implemented by the calling class

    }
}
