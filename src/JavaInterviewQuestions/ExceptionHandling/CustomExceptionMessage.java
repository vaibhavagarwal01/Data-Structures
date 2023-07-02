package JavaInterviewQuestions.ExceptionHandling;

public class CustomExceptionMessage {

    public static void funcB(int x) {
        try {
            if(x == 5) {
                throw new Exception("This is my custom exception");
            }
        } catch(Exception e) {
            System.out.println("Exception caught in funcB: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("End of funcB");
    }

    public static void funcA(int x) {
        try {
            funcB(x);
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
            funcA(5);
        } catch (Exception e) {
            System.out.println("caught in main");
        }
        System.out.println("End of main!!");
    }
}
