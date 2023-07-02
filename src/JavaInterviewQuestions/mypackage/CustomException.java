package JavaInterviewQuestions.mypackage;

class AgeLessThan10Exception extends Exception{
    AgeLessThan10Exception(String message){
        super(message);
    }
}

class AgeGreaterThan60Exception extends Exception{
    AgeGreaterThan60Exception(String message){
        super(message);
    }
}

public class CustomException {

    public static void funcA(int age) {
        try {
            System.out.println("Line1");
            if(age < 10) {
                throw new AgeLessThan10Exception("age cannot be less than 10");
            }
            System.out.println("Line2");
            if(age > 60) {
                throw new AgeGreaterThan60Exception("age cannot be greater than 60");
            }

        } catch(AgeLessThan10Exception e) {
            System.out.println("AgeLessThan10Exception caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(AgeGreaterThan60Exception e) {
            System.out.println("AgeGreaterThan60Exception caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("End of funcA");
   }

    public static void main(String[] args) {
        System.out.println("Hello world");
        try{
            funcA(65);
        } catch (Exception e) {
            System.out.println("caught in main");
        }
        System.out.println("End of main!!");
    }
}
