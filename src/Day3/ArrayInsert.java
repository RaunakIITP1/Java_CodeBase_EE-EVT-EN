package Day3;

import java.util.Scanner;

public class ArrayInsert {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of elements");

        int n= sc.nextInt();
        int [] arr=  new int[n];
        System.out.println("enter array elememts");

        for(int i=0; i<n-1;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int pos=1;
        int element= 25;

        for(int i=n-1; i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=element;

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }


}
