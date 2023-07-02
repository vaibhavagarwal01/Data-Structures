package JavaInterviewQuestions.ExceptionHandling;

public class ExceptionHandlingWithThrow {

    public static void funcA() {
        try {
            int a[] = new int[3];
            a[2] = 4;
            System.out.println("Line1");
            System.out.println("Line2");
            int b = 5/0;
            System.out.println("Line3");
            System.out.println("line4");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw e;
        } catch(Exception e) {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw e;
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

//        funcA();

        System.out.println("End of main!!");
    }
}
