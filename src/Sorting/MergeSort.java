package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    static void mergeSort(int[]array, int l, int r){
        int m;
        if(l<r) {
            m = (l+r)/2;
            mergeSort(array, l, m);
            mergeSort(array, m+1,r);
            mergeSortedArrays(array, l, m , r);
        }
    }

    static void mergeSortedArrays(int[] arr, int l, int m, int r) {
        int[] a1 = new int[m + 1];
        for (int i = 0; i <= m; i++) {
            a1[i] = arr[i];
        }
        int[] a2 = new int[r - m];
        int j = 0;
        for (int i = m + 1; i <= r; i++) {
            a2[j] = arr[i];
            j++;
        }
        int i, k = -1;
        for (i = 0, j = 0; i < a1.length && j < a2.length; ) {
            if (a1[i] <= a2[j]) {
                arr[++k] = a1[i];
                i++;
            } else {
                arr[++k] = a2[j];
                j++;
            }
        }
        while (i < a1.length) {
            arr[++k] = a1[i];
            i++;
        }
        while (j < a2.length) {
            arr[++k] = a2[j];
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] array = new int[s];
        for(int i=0;i<s;i++) {
            array[i]=sc.nextInt();
        }
        mergeSort(array, 0, array.length-1);
        for(int i=0; i< array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}