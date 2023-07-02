package OOPs.Abstraction.Interface.InterfaceTutorialPart2;

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

class StudentMongoDBRepository {
    void insertStudent(Student st) {
        // write all logic to insert student into Mongo DB via JDBC and writing our own queries.
        System.out.println("Hey!! I inserted student data into Mongo database.");
    }
}

public class InterfaceTutorialPart2 {
    static void serviceLayerFunc(StudentMongoDBRepository repository, Student st) {

        repository.insertStudent(st);
    }

    public static void main(String[] args) {
        StudentMongoDBRepository repository = new StudentMongoDBRepository();
        Student st = new Student();
        st.name = "Vaibhav";
        st.roll = 1;
        serviceLayerFunc(repository, st);
    }
}
