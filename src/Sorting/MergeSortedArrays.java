package Sorting;

import java.util.Scanner;

public class MergeSortedArrays {

    static int[] mergeSortedArrays(int[] a1, int[] a2, int s1, int s2) {
        int s3 = s1 + s2;
        int[] a3 = new int[s3];
        int i, j, k = -1;
        for(i=0, j=0; i<s1 && j<s2 ;) {
            if (a1[i] <= a2[j]) {
                a3[++k] = a1[i];
                i++;
            }
            else {
                a3[++k] = a2[j];
                j++;
            }
        }
        while(i<s1) {
            a3[++k] = a1[i];
            i++;
        }
        while(j<s2) {
            a3[++k] = a2[j];
            j++;
        }
        return a3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int[] a1 = new int[s1];
        for(int i=0; i<s1; i++) {
            a1[i] = sc.nextInt();
        }
        int s2 = sc.nextInt();
        int[] a2= new int[s2];
        for(int i=0; i<s2; i++) {
            a2[i] = sc.nextInt();
        }
        int[] array = new int[s1+s2];
        array=mergeSortedArrays(a1, a2, s1, s2);
        for(int i=0; i< array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
