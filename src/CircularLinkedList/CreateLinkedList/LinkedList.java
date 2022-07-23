package CircularLinkedList.CreateLinkedList;

class Node {
    
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    Node head;

    void printList() {
        Node n = head;
        do {
            System.out.print(n.data+" ");
            n = n.next;
        }
        while(n != head);
    }
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();

        linkedList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        linkedList.head.next = second;
        second.next = third;
        third.next = linkedList.head;
        linkedList.printList();
    }
}


