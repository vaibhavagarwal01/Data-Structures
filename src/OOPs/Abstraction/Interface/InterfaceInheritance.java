package OOPs.Abstraction.Interface;
interface Printaable {
    void printt();
}
interface Showaable extends Printaable {
    void showw();
}

class InterfaceInheritance implements Showaable {
    public void printt() {
        System.out.println("Printable");
    }
    public void showw() {
        System.out.println("Showable");
    }

    public static void main(String[] args) {
        InterfaceInheritance i = new InterfaceInheritance();
        i.showw();
        i.printt();
    }
}
