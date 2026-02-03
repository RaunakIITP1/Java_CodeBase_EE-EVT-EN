package Day1;

import java.util.Scanner;

public class SumOfElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of elements");
        int n = sc.nextInt();

        int [] arr = new int[n];

        int sum=0;

        System.out.println("enter the elements of the array");
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
            sum+= arr[i];
        }


        System.out.println("sum of the elements of the array is : " + sum);
    }
}
