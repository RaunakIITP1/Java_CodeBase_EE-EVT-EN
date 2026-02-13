package Day4_LinkedList;

public class InsertLL {

    static class Node{
        int data;
        Node next;


        Node(int data){
            this.data= data;
            this.next= null;
        }
    }


    static void main(String[] args) {
        Node head= new Node(10);

        Node Second= new Node(20);

        Node third= new Node(30);

        head.next= Second;
        Second.next= third;

        Node newNode= new Node(5);
        newNode.next= head;

        Node endNode= new Node(50);

        endNode.next=null;
        third.next= endNode;

//        Traversing LL

        Node temp = newNode;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }

        System.out.print("Null");



    }
}
