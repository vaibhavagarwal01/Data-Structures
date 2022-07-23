package Stack.LinkedList.Pop;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class Stack {
    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        if(top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if(top == null) {
            System.out.println("Stack is underflow");
            return;
        }
        top = top.next;
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

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack();

        stack.pop();
        stack.printStack();

        stack.pop();
        stack.printStack();

    }
}
