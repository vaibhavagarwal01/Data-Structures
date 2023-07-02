package LinkedList.InsertAtEnd;

import LinkedList.Node;
public class LinkedList {
    Node head;
    void InsertionAtEnd(int data) {
        Node newNode =new Node(data);
        if(head==null) {
            head=newNode;
        }
        else {
            Node current = head;
            while(current.next!=null) {
                current=current.next;
            }
            newNode.data=data;
            current.next=newNode;
        }
    }
    void printlist() {
        Node n=head;
        while(n!=null) {
            System.out.print(n.data+" ");
            n=n.next;
        }


    }
    public static void main(String[] args) {

        LinkedList linkList= new LinkedList();
        linkList.InsertionAtEnd(4);
        linkList.InsertionAtEnd(8);
        linkList.InsertionAtEnd(10);
        linkList.InsertionAtEnd(56);
        linkList.printlist();





    }
}

//class Node {
//    int data;
//    Node next;
//
//    Node(int d) {
//        data = d;
//        next = null;
//    }
//}
