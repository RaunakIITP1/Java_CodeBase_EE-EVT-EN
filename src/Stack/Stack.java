package Stack;

public class Stack {
    static void main(String[] args) {
        int maxSize= 5;
        int [] stack =new int[maxSize];
        int top=-1;

//        Push 10

        if(top==maxSize-1){
            System.out.print("Stack overflow");
        }
        else{
            top++;
            stack[top]= 10;
        }
        //        Push 20

        if(top==maxSize-1){
            System.out.print("Stack overflow");
        }
        else{
            top++;
            stack[top]= 20;
        }

        //        Push 30

        if(top==maxSize-1){
            System.out.print("Stack overflow");
        }
        else{
            top++;
            stack[top]= 30;
        }

        //        Push 40

        if(top==maxSize-1){
            System.out.print("Stack overflow");
        }
        else{
            top++;
            stack[top]= 40;
        }

//        Pop

        if(top==-1){
            System.out.println("stack underflow");
        }
        else{


            int pop= stack[top];
            top--;
            System.out.println("popped element is " + pop);
        }



        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
