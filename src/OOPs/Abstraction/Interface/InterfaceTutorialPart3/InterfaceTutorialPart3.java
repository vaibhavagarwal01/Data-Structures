package OOPs.Abstraction.Interface.InterfaceTutorialPart3;

class Student {
    int roll;
    String name;

    @Override
    public String toString() {
        return "Student: name=" + this.name + " roll=" + this.roll;
    }
}

interface StudentRepository {
    void insertStudent(Student st);
    Student getStudentByRoll(int roll);
}

class StudentMySQLRepository implements StudentRepository{
    public void insertStudent(Student st) {
        // write all logic to insert student into MySQL DB via JDBC and writing our own queries.
        System.out.println("Hey!! I inserted student data into MySQL database.");
    }

    public Student getStudentByRoll(int roll) {
        // write all logic to get student from MySQL Db based on roll number by writing SQL queries and calling database via JDBC


        Student st = new Student();
        st.name = "vaibhav";
        st.roll = roll;
        System.out.println("Hey!! I fetched data of student from MySQL with roll " + roll);
        return st;
    }
}

class StudentMongoDBRepository implements StudentRepository {
    public void insertStudent(Student st) {
        // write all logic to insert student into Mongo DB via JDBC and writing our own queries.
        System.out.println("Hey!! I inserted student data into Mongo database.");
    }

    public Student getStudentByRoll(int roll) {
        // write all logic to get student from Mongo Db based on roll number by writing NoSQL/MongoDB queries and calling database via JDBC


        Student st = new Student();
        st.name = "vaibhav";
        st.roll = roll;
        System.out.println("Hey!! I fetched data of student from MongoDB with roll " + roll);
        return st;
    }
}

public class InterfaceTutorialPart3 {
    static void serviceLayerInsertFunc(StudentRepository repository, Student st) {

        repository.insertStudent(st);
    }

    static Student serviceLayerGetStudentFunc(StudentRepository repository, int roll) {
        Student st = repository.getStudentByRoll(roll);
        return st;
    }


    public static void main(String[] args) {
        StudentMongoDBRepository repository = new StudentMongoDBRepository();
//        StudentMySQLRepository repository = new StudentMySQLRepository();
        Student st = new Student();
        st.name = "Vaibhav";
        st.roll = 1;
        serviceLayerInsertFunc(repository, st);

        Student st1 = serviceLayerGetStudentFunc(repository, 12);
        System.out.println("Fetched student " + st1);
    }
}
