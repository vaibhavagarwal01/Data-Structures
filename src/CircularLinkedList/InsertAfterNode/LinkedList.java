package CircularLinkedList.InsertAfterNode;

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
        int flag=0;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head == tail) {
            head.next = newNode;
            newNode.next = head;
            tail = newNode;
            return;
        }
        if(head.data == n) {
            newNode.next = head.next;
            head.next = newNode;
            return;
        }
        do {
            if(current.data == n) {
                flag = 1;
                break;
            }
            current = current.next;
        }
        while(current != head);
        if(flag==0) {
            System.out.println("Node does not exist in the list");
            return;
        }
        if(current == tail) {
            current.next = newNode;
            newNode.next = head;
            tail = newNode;
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

        linkedList.insertAfterNode(66, 76);
        linkedList.printList();
        linkedList.insertAfterNode(26, 50);
        linkedList.printList();
        linkedList.insertAfterNode(100, 50);
        linkedList.printList();
    }
}



