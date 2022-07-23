package DoublyLinkedList.DeleteAfterNode;

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

    void deleteAfterNode(int n) {
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
        if(current.next == tail) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            return;
        }
        if(current == tail) {
            System.out.println("Reached end of the list so nothing to delete");
            return;
        }
        Node temp;
        temp = current.next;
        current.next = temp.next;
        temp.next.prev = current;
        temp.next = null;
        temp.prev = null;
        temp = null;
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

        linkedList.deleteAfterNode(26);
        linkedList.printList();;
        linkedList.printListRightToLeft();

    }
}


