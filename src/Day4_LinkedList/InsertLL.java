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
//     Traversing LL before insert operation
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }

        System.out.println("Null");

//        Insert at beginning

        Node newNode= new Node(5);
        newNode.next= head;
//    Traversing LL after inserting element at beginning
        temp = newNode;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }

        System.out.println("Null");



//        Insert at end
        Node endNode= new Node(50);
        endNode.next=null;
        third.next= endNode;

//        Traversing LL after inserting element at end

        temp = newNode;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }

        System.out.print("Null");



    }
}
