package OOPs.Inheritance.HeirarchialInheritance;

class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}

class Cat extends Animal {
    void meowing() {
        System.out.println("Meowing");
    }
}


public class HeirarchialInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        //d.meowing(); will give a error

        Cat c = new Cat();
        c.eat();
        c.meowing();
        //c.bark(); will give a error
    }
}