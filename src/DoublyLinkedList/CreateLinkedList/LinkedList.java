package DoublyLinkedList.CreateLinkedList;

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
     Node head,tail;

    void printList() {
         Node n=head;
        while(n!=null) {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }

    void printListRightToLeft() {
        Node n=tail;
        while(n!=null) {
            System.out.print(n.data+" ");
            n=n.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList  linkedList = new  LinkedList();

        linkedList.head = new  Node(1);
        Node second = new  Node(2);
        Node third = new  Node(3);

        linkedList.head.next = second;// Link first node with the second node
        linkedList.head.prev=null;    // Link

        second.prev=linkedList.head;
        second.next = third;// Link second node with the third node

        third.prev=second;
        linkedList.tail=third;

        linkedList.printList();
        linkedList.printListRightToLeft();

    }
}

