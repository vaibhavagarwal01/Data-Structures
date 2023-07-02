package Stack.LinkedList.EvaluationOfPostfixExpression;

import java.util.Scanner;
import java.util.Stack;
public class PostfixEvaluation {

    static int evaluatePostfix(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                stack.push(ch-'0');
            }
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch(ch) {
                    case '+':
                        stack.push(val1+val2);
                        break;
                    case '-':
                        stack.push(val2-val1);
                        break;
                    case '*':
                        stack.push(val2*val1);
                        break;
                    case '/':
                        stack.push(val2/val1);

                }

            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Postfix evaluation : "+evaluatePostfix(s));


    }
}
