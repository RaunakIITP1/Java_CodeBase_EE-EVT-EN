package Day1;

public class ArrayBasics {
    static void main(String[] args) {
        int x=98;
        System.out.println(x);


        int [] arr= {98, 75, 64, 40, 69};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

//        print the elements using loop

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
