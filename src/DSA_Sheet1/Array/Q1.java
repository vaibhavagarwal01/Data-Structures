package DSA_Sheet1.Array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] rev = new int[5];
        int index=0;
        for(int i = 4; i>=0; i--) {
            rev[index++]= arr[i];
        }
        for(int i=0; i<5; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<5; i++ ){
            System.out.print(rev[i]+" ");
        }
    }
}
