package OOPs.Polymorphism.MethodOverriding;

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
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        PAS pas = new PAS();
        System.out.println("Interest rate of SBI : "+sbi.getRateOfInterest());
        System.out.println("Interest rate of HDFC : "+hdfc.getRateOfInterest());
        System.out.println("Interest rate of PAS : "+pas.getRateOfInterest());

    }
}
