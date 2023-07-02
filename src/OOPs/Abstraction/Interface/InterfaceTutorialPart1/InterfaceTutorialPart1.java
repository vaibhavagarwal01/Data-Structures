package OOPs.Abstraction.Interface.InterfaceTutorialPart1;

class Student {
    int roll;
    String name;
}

class StudentMySQLRepository {
    void insertStudent(Student st) {
        // write all logic to insert student into MySQL DB via JDBC and writing our own queries.
        System.out.println("Hey!! I inserted student data into MySQL database.");
    }
}

public class InterfaceTutorialPart1 {
    static void serviceLayerFunc(StudentMySQLRepository repository, Student st) {

        repository.insertStudent(st);
    }

    public static void main(String[] args) {
        StudentMySQLRepository repository = new StudentMySQLRepository();
        Student st = new Student();
        st.name = "Vaibhav";
        st.roll = 1;
        serviceLayerFunc(repository, st);
    }
}
