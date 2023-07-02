package JavaInterviewQuestions;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class Student{
    int roll;
    String name;

    @Override
    public boolean equals(Object obj){
        Student ob = (Student) obj;
        if(this.roll == ob.roll && this.name.equals(ob.name)) {
            return true;
        }
        return false;
    }
}

class CompareObjects {
    public static void main(String[] args) {
        System.out.println("Hello, World!\n");

        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "aniket";
        Student s2 = new Student();
        s2.roll = 1;
        s2. name = "aniket";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }
}