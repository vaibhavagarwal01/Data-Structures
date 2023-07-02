package LinkedList.CreateLinkedList;

public class LinkedList {
    Node head;

    void printList() {
        Node n=head;
        while(n!=null) {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String[] args) {
        LinkedList linklist=new LinkedList();

        linklist.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        /* Three nodes have been allocated dynamically.
      We have references to these three blocks as head,
      second and third

      linklist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 1  | null |     | 2  | null |     |  3 | null |
     +----+------+     +----+------+     +----+------+ */

        linklist.head.next = second; // Link first node with the second node

    /*  Now next of the first Node refers to the second.  So they
        both are linked.

     linklist.head        second              third
        |                |                  |
        |                |                  |
    +----+------+     +----+------+     +----+------+
    | 1  |  o-------->| 2  | null |     |  3 | null |
    +----+------+     +----+------+     +----+------+ */

        second.next = third; // Link second node with the third node

    /*  Now next of the second Node refers to third.  So all three
        nodes are linked.

     linklist.head        second              third
        |                |                  |
        |                |                  |
    +----+------+     +----+------+     +----+------+
    | 1  |  o-------->| 2  |  o-------->|  3 | null |
    +----+------+     +----+------+     +----+------+ */

        linklist.printList();

    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}