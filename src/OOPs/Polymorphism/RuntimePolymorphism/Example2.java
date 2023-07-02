package OOPs.Polymorphism.RuntimePolymorphism;

class Bank {
    int  getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int  getRateOfInterest() {
        return 7;
    }
}

class HDFC extends Bank {
    int  getRateOfInterest() {
        return 8;
    }
}

class PAS extends Bank {
    int  getRateOfInterest() {
        return 9;
    }
}
public class Example2 {
    public static void main(String[] args) {
        Bank b;        // here upcasting is done
        b = new SBI(); // here upcasting is done when reference variable of a parent class refers to an object of child class
        System.out.println("Interest rate of SBI : "+b.getRateOfInterest());
        b = new HDFC();
        System.out.println("Interest rate of HDFC : "+b.getRateOfInterest());
        b = new PAS();
        System.out.println("Interest rate of PAS : "+b.getRateOfInterest());

    }
}

