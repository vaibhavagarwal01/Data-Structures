package Queue.Array;

public class Queue {
    int[] array;
    int front, rear, capacity;
    Queue(int capacity) {
        this.capacity = capacity ;
        array = new int[capacity];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if ((rear + 1) % capacity == front) {
            return true;
        }
        else {
            return false;
        }
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println(data+" can not be enqueued");
            return;
        }
        if(front == -1 && rear == -1) {
            array[rear+1] = data;
            front = front+1;
            rear = rear+1;
            return;
        }
        rear = ((rear + 1)%capacity);
        array[rear] = data;
    }

    boolean isEmpty() {
        if(front == -1 && rear == -1) {
            return true;
        }
        else
            return false;
    }

    void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue can not be dequeued");
            return;
        }
        if(front == rear) {
            front = -1;
            rear = -1;
            return;
        }
        front = (front+1)%capacity;
    }

    void print() {
        int i;
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for( i=front; i!=rear ;i=(i+1)%capacity) {
            System.out.print(array[i]+" ");
        }
        System.out.println(array[i]);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(6);
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




        System.out.println("Front ="+queue.front);
        System.out.println("Rear ="+queue.rear);



//        queue.dequeue();
//        queue.print();




    }
}
