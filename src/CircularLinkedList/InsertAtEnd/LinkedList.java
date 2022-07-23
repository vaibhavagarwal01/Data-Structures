package CircularLinkedList.InsertAtEnd;

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

    void printList() {
        Node n = head;
        do {
            System.out.print(n.data+" ");
            n = n.next;
        }
        while(n != head);
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtEnd(26);
        linkedList.insertAtEnd(36);
        linkedList.insertAtEnd(46);
        linkedList.insertAtEnd(56);
        linkedList.insertAtEnd(66);

        linkedList.printList();
    }
}



