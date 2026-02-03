package Day1;

import java.util.Scanner;

public class IOarrayElements {
    static void main(String[] args) {

//        int [] arr = new int[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

//

        System.out.println("enter the elements of the array");
        for(int i =0; i<n; i++){
//            int x = sc.nextInt();
//            arr[i]=x;
            arr[i]=sc.nextInt();
        }

        System.out.println("printing the elements");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
