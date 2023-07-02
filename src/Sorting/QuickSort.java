package Sorting;

import java.util.Scanner;

public class QuickSort {

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low-1;
        for(int j=low; j<=high-1; j++) {
            if(array[j]<pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1,high);
        return (i+1);
    }

    static void quickSort(int[] array, int low, int high) {
        if(low < high) {
            int p = partition(array, low, high);
            quickSort(array, low, p-1);
            quickSort(array, p+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i=0; i<length; i++) {
            array[i]=sc.nextInt();
        }
        quickSort(array, 0, length-1);
        System.out.println("Sorted array is : ");
        for(int i=0; i<length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
