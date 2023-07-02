package DSA_Sheet1.Array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        for(int i = 0; i < 5-1; i++) {
            int temp = 0;
            if(arr[i]>arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(arr[k-1]);

    }
}
