package DoublyLinkedList.InsertAtPosition;

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

    void insertBeforeNode(int n , int data ) {
        Node current = head;
        Node newNode = new Node(data);
        if(current == null )  {
            System.out.println("List is empty");
            return;
        }
        while(current != null){
            if (current.next.data == n) {
                break;
            }
            current=current.next;
        }
        if(current == null) {
            System.out.println(n+" not found in the list ");
            return;
        }
        newNode.next=current.next;
        newNode.prev=current;
        current.next.prev=newNode;
        current.next=newNode;

    }

    void insertAfterNode(int n , int data ) {
        Node current=head;
        Node newNode = new Node(data);
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        while(current!=null) {
            if(current.data==n)
                break;
            current=current.next;
        }
        if(current==null) {
            System.out.println(n+" not found in the list");
            return;
        }
        newNode.next = current.next;
        current.next.prev = newNode;
        newNode.prev = current;

        current.next = newNode;


    }

    void insertAtPosition(int pos, int data ) {
        Node current = head;
        Node newNode = new Node(data);
        if (current == null) {
            System.out.println("List is empty");
        }
        for (int i = 1; i < pos - 1; i++) {
            if (current == null)
                break;
            current = current.next;
        }
        if (current == null) {
            System.out.println("invalid position");
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next == null) {
            current.next = newNode;
            tail=newNode;
        }

        else {
            current.next.prev = newNode;
            current.next = newNode;
        }
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


        linkedList.insertAtBeginning(66);
        linkedList.insertAtEnd(76);
        linkedList.insertAtEnd(86);
        linkedList.insertAtEnd(96);
        linkedList.insertAtBeginning(56);
        linkedList.insertAtBeginning(46);

        linkedList.printList();
        linkedList.printListRightToLeft();

        linkedList.insertAfterNode(56, 106);
        linkedList.printList();
        linkedList.printListRightToLeft();

        linkedList.insertBeforeNode(56, 205 );
        linkedList.printList();
        linkedList.printListRightToLeft();

        linkedList.insertAtPosition(9,369);
        linkedList.printList();
        linkedList.printListRightToLeft();

    }
}
