package JavaInterviewQuestions.ExceptionHandling;

class AgeIsGreaterThan60Exception extends Exception{
    AgeIsGreaterThan60Exception(String message){
        super(message);
    }
}

class AgeIsLessThan10Exception extends Exception{
    AgeIsLessThan10Exception(String message){
        super(message);
    }
}

public class Throws {

    public static void funcB(int age) throws AgeIsGreaterThan60Exception, AgeIsLessThan10Exception{
        System.out.println("funcB line 1");
        if(age < 10) {
            throw new AgeIsLessThan10Exception("age cannot be less than 10");
        }
        if(age > 60) {
            throw new AgeIsGreaterThan60Exception("age cannot be greater than 60");
        }
    }

    public static void funcA() {
        try {
            funcB(67);
        } catch(AgeIsGreaterThan60Exception e) {
            System.out.println("AgeIsGreaterThan60Exception caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        funcB(77);
       System.out.println("End of funcA");
   }

    public static void main(String[] args) {
        System.out.println("Hello world");
        try{
            funcA();
        } catch (Exception e) {
            System.out.println("caught in main");
        }
        System.out.println("End of main!!");
    }
}
