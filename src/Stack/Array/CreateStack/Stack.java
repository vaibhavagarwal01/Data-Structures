package Stack.Array.CreateStack;

class Stack {

    int[] stack;
    int top;
    Stack(int size) {
        stack = new int[size];
        top = -1;

    }
    void push(int data) {
        if(top == stack.length-1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = data;
    }

    void pop() {
        if(top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        top--;
    }

    void printStack() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top; i>=0; i--) {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack();
        stack.push(50);

        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();

    }
}
