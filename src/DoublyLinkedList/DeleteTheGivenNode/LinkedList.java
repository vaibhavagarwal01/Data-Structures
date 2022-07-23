package DoublyLinkedList.DeleteTheGivenNode;

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

    void deleteTheGivenNode(int n) {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            if(current.data == n)
                break;
            current = current.next;
        }
        if(current == null) {
            System.out.println("Node does not exist in the list");
            return;
        }
        if(head == tail) {
            head = null;
            tail = null;
            return;
        }
        if(current == head) {
            head = current.next;
            head.prev = null;
            current.next = null;
            current = null;
            return;

        }
        if(current == tail) {
            tail=current.prev;
            current.prev = null;
            tail.next=null;
            current = null;
            return;
        }
        Node temp;
        temp = current.prev;
        temp.next = current.next;
        temp.next.prev = temp;
        current.next = null;
        current.prev = null;
        current = null;
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

        linkedList.deleteTheGivenNode(56);
        linkedList.printList();;
        linkedList.printListRightToLeft();

    }
}


