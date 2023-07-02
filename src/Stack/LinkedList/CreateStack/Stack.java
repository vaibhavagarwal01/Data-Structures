package Stack.LinkedList.CreateStack;

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

    void printStack() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        while (top != null) {
            System.out.println(top.data + " ");
            top = top.next;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.top = new Node(30);
        Node second = new Node(5);
        Node third = new Node(10);

        stack.top.next = second;
        second.next = third;

        stack.printStack();

    }
}
