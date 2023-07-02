package DoublyLinkedList.InsertAtBeginning;

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

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;

        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }

    void insertAtEnd(int data) {
        Node newNode=new Node(data);
        Node current=head;
        if(head==null) {
            head=newNode;
            tail = newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
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

        LinkedList linkList = new LinkedList();


        linkList.insertAtBeginning(16);
        linkList.insertAtEnd(26);
        linkList.insertAtEnd(36);
        linkList.insertAtEnd(46);
        linkList.insertAtBeginning(26);
        linkList.insertAtBeginning(36);
        

        linkList.printList();
        linkList.printListRightToLeft();
    }
}