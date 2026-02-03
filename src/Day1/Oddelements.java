package Day1;

import java.util.Scanner;

public class Oddelements {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int [] a= new int[n];

//        input elements

        for (int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }

        for(int i=0; i<n; i++){

            if(a[i]%2!=0) {
                System.out.println(a[i]);
            }
        }
    }
}
