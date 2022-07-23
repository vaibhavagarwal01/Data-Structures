package LinkedList.ReverseLinkedList;

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
         Node newNode = new  Node(data);
        if(head==null) {
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }

    }
    void insertAfterNode(int previous , int data) {
         Node newNode = new  Node(data);
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

    void InsertionAtEnd(int data) {
         Node newNode =new  Node(data);
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
    void reverse() {
        Node prev,current,next;
        current=head.next;  //  OR  current=head;
        prev=head;          //  OR  prev=null;
        head.next=null;     //  OR  next=null;
        while(current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;

    }

    void printList() {
         Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

    }

    public static void main(String[] args) {
         LinkedList linkList=new  LinkedList();

        linkList.InsertionAtEnd(56);
        linkList.InsertionAtEnd(66);
        linkList.InsertionAtEnd(76);
        linkList.InsertionAtEnd(86);
        linkList.insertAtBeginning(46);
        linkList.insertAtBeginning(36);
        linkList.insertAtBeginning(26);
        linkList.printList();
        System.out.println();
        linkList.insertAfterNode(86 ,96);
        linkList.printList();
        System.out.println();

        linkList.reverse();
        linkList.printList();


    }
}

