package LinkedList.InserAtBeginning;
class Node {
    int data;
    Node next;
    Node(int d) {
        data=d;
        next=null;
    }
}

public class LinkedList {
    Node head;
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }

    }

    void InsertionAtEnd(int data) {
        Node newNode =new Node(data);
        if(head==null) {
            head=newNode;
        }
        else {
            Node current=head;
            while(current.next!=null) {
                current=current.next;
            }
            newNode.data=data;
            current.next=newNode;
        }
    }
    void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        LinkedList linkList=new LinkedList();



        linkList.InsertionAtEnd(56);
        linkList.InsertionAtEnd(66);
        linkList.InsertionAtEnd(76);
        linkList.InsertionAtEnd(86);
        linkList.insertAtBeginning(46);
        linkList.insertAtBeginning(36);
        linkList.insertAtBeginning(26);
        linkList.insertAtBeginning(16);

        linkList.printList();
    }
}
