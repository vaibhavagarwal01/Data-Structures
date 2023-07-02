package JavaInterviewQuestions.CommandLineArguments;//package JavaInterviewQuestions;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class Args {
    // compile - javac Args.Java
    // run with arguments - java Args data1 data2 data3
    public static void main(String[] args) {
        System.out.println("Hello world");
        for(int i=0; i < args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println("End!!!");
    }
}

// we can edit the configurations in the modify edit configurations tab