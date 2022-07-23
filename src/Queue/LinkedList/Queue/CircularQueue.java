package Queue.LinkedList.Queue;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class CircularQueue {
    Node front = null, rear = null;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if(front == null && rear == null) {
            front = newNode;
            rear = newNode;
            front.next = newNode;
            return;
        }
        newNode.next = front;
        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if(front == null && rear == null) {
            System.out.println("Data can not be dequeued");
            return;
        }
        if(front == rear) {
            front = null;
            rear = null;
            return;
        }
        Node temp;
        temp = front;
        front = front.next;
        temp.next = null;
        rear.next = front;
    }
    void print() {
        if(front == null && rear == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while(current != rear) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println(current.data);
    }
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.print();
//        queue.dequeue();

        queue.enqueue(56);
        queue.print();

//        queue.dequeue();
//        queue.print();

        queue.enqueue(10);
        queue.print();

        queue.enqueue(20);
        queue.print();

        queue.enqueue(5);
        queue.print();

        queue.dequeue();
        queue.print();

        queue.dequeue();
        queue.print();

        queue.dequeue();
        queue.print();

        queue.enqueue(5);
        queue.print();

        queue.enqueue(100);
        queue.print();

        queue.enqueue(5);
        queue.print();

        queue.enqueue(36);
        queue.print();

        queue.enqueue(36);
        queue.print();

        queue.enqueue(36);
        queue.print();




        System.out.println("Front = "+queue.front);
        System.out.println("Rear = "+queue.rear);



//        queue.dequeue();
//        queue.print();



    }
}
