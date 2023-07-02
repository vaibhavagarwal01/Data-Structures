package DoublyLinkedList.DeleteAtBeginning;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

public class LinkedList {

    Node head, tail;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node current = head;
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;

        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void deleteAtBeginning() {
        if(head == null) {
            System.out.println("List is empty");
        }
        if(head == tail) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    void printList() {
        Node n = head;
        while(n != null) {
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }

    void printListRightToLeft() {
        Node n = tail;
        while(n != null) {
            System.out.print(n.data+" ");
            n = n.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtEnd(26);
        linkedList.insertAtEnd(36);
        linkedList.insertAtEnd(46);
        linkedList.insertAtEnd(56);
        linkedList.insertAtEnd(66);
        linkedList.insertAtEnd(76);
        linkedList.insertAtEnd(86);
        linkedList.insertAtEnd(96);


        linkedList.printList();
        linkedList.printListRightToLeft();

        linkedList.deleteAtBeginning();
        linkedList.printList();;
        linkedList.printListRightToLeft();

    }
}


