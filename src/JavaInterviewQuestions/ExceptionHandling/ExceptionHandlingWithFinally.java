package JavaInterviewQuestions.ExceptionHandling;

public class ExceptionHandlingWithFinally {

    public static void funcA() {
        try {
            int a[] = new int[3];
            a[2] = 4;
            System.out.println("Line1");
            System.out.println("Line2");
            int b = 5/0;
            System.out.println("Line3");
            System.out.println("line4");
        } catch(Exception e) {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw e;
        }finally {
            System.out.println("I am being printed everytime");
        }
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
