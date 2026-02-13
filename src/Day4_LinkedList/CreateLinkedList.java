package Day4_LinkedList;

//Creating LL

class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next= null;
    }

}


public class CreateLinkedList {
    static void main(String[] args) {

//        Creating nodes
        Node head= new Node(10);

        head.next=null;

        Node second= new Node(20);

        second.next=null;

        Node third= new Node(30);

        third.next=null;
//        Creating a node which will be inserted at beginning
        Node newNode= new Node(5);
        head.next= newNode;
        head= newNode;

//        linking nodes
        newNode.next= head;
        head.next= second;
        second.next= third;



//        traversing nodes
        Node temp= head;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("Null");


    }
}
