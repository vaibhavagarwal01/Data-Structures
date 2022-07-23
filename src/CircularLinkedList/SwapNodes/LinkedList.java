package CircularLinkedList.SwapNodes;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    Node head,tail;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next=newNode;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    void swapNodes() {
        Node current = head;
        Node temp;
        if(head.next == tail) {
            temp = head;
            head= tail;
            tail = temp;
            return;
        }
        while(current.next != tail) {
            current = current.next;
        }
        tail.next = head.next;
        head.next = tail;
        temp = head;
        head = tail;
        tail = temp;
        current.next = tail;
    }

    void printList() {
        Node n = head;
        if(head == null) {
            return;
        }
        do {
            System.out.print(n.data+" ");
            n = n.next;
        } while(n != head);
        System.out.println();

    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtEnd(26);
        linkedList.insertAtEnd(36);
        linkedList.insertAtEnd(46);
        linkedList.insertAtEnd(56);
        linkedList.insertAtEnd(66);
        linkedList.printList();

        linkedList.swapNodes();
        linkedList.printList();


    }
}



