package DoublyLinkedList.InsertAtEnd;

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
        LinkedList LinkList = new LinkedList();

        LinkList.insertAtEnd(26);
        LinkList.insertAtEnd(36);
        LinkList.insertAtEnd(46);


        LinkList.printList();
        LinkList.printListRightToLeft();

    }
}


