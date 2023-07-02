package LinkedList.SwapNodes;

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

    void swapNodes(int x,int y) {
        if(x==y) {
            return;
        }

        Node prevX=null,currentX=head;
        while(currentX!=null&&currentX.data!=x) {
            prevX=currentX;
            currentX=currentX.next;
        }

        Node prevY=null,currentY=head;
        while(currentY!=null&&currentY.data!=y) {
            prevY=currentY;
            currentY=currentY.next;
        }
        if(currentX==null||currentY==null){
            return;
        }
        if(prevX!=null) {
            prevX.next=currentY;
        }
        else {
            head=currentY;

        }
        if(prevY!=null) {
            prevY.next=currentX;
        }
        else {
            head=currentX;
        }
        Node temp=currentX.next;
        currentX.next=currentY.next;
        currentY.next=temp;


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
        linkList.printList();
        System.out.println();
        linkList.insertAfterNode(86 ,96);
        linkList.printList();
        System.out.println();

        linkList.swapNodes(36,86);
        linkList.printList();


    }
}


