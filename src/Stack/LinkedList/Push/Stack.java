package Stack.LinkedList.Push;

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

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);



        stack.printStack();

    }
}
