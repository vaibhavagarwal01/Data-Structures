package LinkedList.DeleteAtEnd;

class Node {
    int data ;
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
    void insertAfterNode(int previous , int data) {
        Node newNode = new Node(data);
        Node current=head;
        if(current==null) {
            System.out.println("List is empty");
            return;
        }
        while(current!=null) {
            if(current.data==previous)
                break;
            current=current.next;
        }
        if(current==null) {
            System.out.println(previous + " not found in the list");
            return;
        }
        newNode.next=current.next;
        current.next=newNode;
    }

    void insertAtPosition(int pos,int data) {
        Node current=head;
        if(current==null) {
            System.out.println("List is empty");
            return;
        }
        for(int i=1;i<pos;i++) {
            if(current==null)
                break;
            current=current.next;
        }
        if(current==null) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode=new Node(data);
        newNode.next=current.next;
        current.next=newNode;

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
    void deleteAtEnd() {
        Node current=head;
        if(current==null) {
            System.out.println("List is empty");
            return;
        }
        if(current.next==null) {
            head=null;
            return;
        }
        while(current.next.next!=null) {
            current= current.next;
        }
        current.next=null;
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
        linkList.insertAtBeginning(36);
        linkList.insertAtBeginning(26);
        linkList.insertAtBeginning(16);
        linkList.printList();
        System.out.println();
        linkList.insertAfterNode(86 ,46);
        linkList.printList();
        System.out.println();
        linkList.insertAtPosition(4,89);
        linkList.printList();
        System.out.println();

        linkList.deleteAtEnd();
        linkList.printList();

    }
}