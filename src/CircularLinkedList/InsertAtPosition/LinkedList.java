package CircularLinkedList.InsertAtPosition;

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

    void insertAfterNode(int n, int data) {
        Node current = head;
        Node newNode = new Node(data);
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head == tail) {
            head.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        do {
            if(current.data == n)
                break;
            current = current.next;
        }
        while(current != head);
//        if(current.next == head) {
//            System.out.println("Node does not exist in the list");
//            return;
//        }
        if(current == tail) {
            current.next = newNode;
            newNode.next = head;
            tail = newNode;
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }
    void insertAtGivenPosition(int pos, int data) {
        Node current = head;
        Node newNode = new Node(data);
        int flag=0;
        if(head == null) {
            if (pos == 1) {
                newNode.next = newNode;
                head = newNode;
                tail = newNode;
                return;
            } else {
                System.out.println("List is empty");
                return;
            }
        }
        if(pos == 1) {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
            return;
        }
        for(int i=1; i<pos-1; i++) {
            current=current.next;
            if(current == head) {
                flag=1;
                break;
            }

        }
        if(flag==1) {
            System.out.println("Invalid position");
            return;
        }
        if(current == tail) {
            current.next = newNode;
            newNode.next = head;
            tail = newNode;
            return;
        }
        if(current.next == tail) {
            newNode.next = current.next;
            current.next = newNode;
            return;
        }
        newNode.next = current.next;
        current.next = newNode;

    }

    void printList() {
        Node n = head;
        if(head == null)
            return;
        do {
            System.out.print(n.data+" ");
            n = n.next;
        }
        while(n != head);
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

        linkedList.insertAtGivenPosition(7, 584);

        linkedList.printList();
    }
}



