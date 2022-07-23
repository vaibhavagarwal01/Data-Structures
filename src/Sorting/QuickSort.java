package Sorting;

import java.util.Scanner;

public class QuickSort {

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low-1;
        for(int j=low; j<=high-1; j++) {
            if(a[j]<pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i+1,high);
        return (i+1);
    }

    static void quickSort(int[] a, int low, int high) {
        if(low<high) {
            int p = partition(a, low, high);
            quickSort(a, low, p-1);
            quickSort(a, p+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        for(int i=0;i<s;i++) {
            a[i]=sc.nextInt();
        }
        quickSort(a, 0, s-1);
        System.out.println("Sorted array is : ");
        for(int i=0; i<s; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
