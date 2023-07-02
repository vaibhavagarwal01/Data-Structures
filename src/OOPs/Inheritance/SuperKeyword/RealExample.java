package OOPs.Inheritance.SuperKeyword;

class Person {
    int id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {
    float salary;
    Emp(int id, String name, float salary) {
        super(id,name);
        this.salary = salary;
    }

    void display() {
        System.out.println(id+" "+name+" "+" "+salary);
    }
}

public class RealExample {
    public static void main(String[] args) {
        Emp e = new Emp(12,"Vaibhav",562000);
        e.display();
    }
}
