package DSA_Sheet1.Array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {85,-1,5,50,1000,456};
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<5;i++) {
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Minimum in the array : "+min);
        System.out.println("Maximum in the array : "+max);
    }
}
