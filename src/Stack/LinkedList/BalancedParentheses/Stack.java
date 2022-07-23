package Stack.LinkedList.BalancedParentheses;

import java.util.Scanner;

class Node {
    char data;
    Node next;
    Node(char c) {
        data = c;
        next = null;
    }
}
public class Stack {

    Node top;

    void push(char data) {
        Node newNode = new Node(data);
        if(top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    char pop() {
        char c = '0';
        if(top == null) {
            return c;
        }
        char popchar;
        popchar = top.data;
        top = top.next;
        return popchar;
    }

    void printStack() {
        Node p = top;
        if (p == null) {
            System.out.println("Stack is empty");
            return;
        }
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        char ch1=' ';
        int flag = 1;
        for(int i=0; i<s.length(); i++) {
            char ch =s.charAt(i);
            if(ch == '{' || ch == '[' || ch=='(')
                stack.push(ch);
            else if(ch == '}' || ch == ']' || ch==')')
                ch1 = stack.pop();
            if(( ch == '}' && ch1 != '{') || ( ch == ']' && ch1 != '[') || ( ch == ')' && ch1 != '(')) {
                flag = 0;
                break;
            }
        }
        if(stack.top != null)
            flag = 0;
        if(flag == 1)
            System.out.println("Balanced parentheses");
        else
            System.out.println("Unbalanced parentheses");

    }
}
