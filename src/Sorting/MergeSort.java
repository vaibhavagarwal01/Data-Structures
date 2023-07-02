package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    static void mergeSort(int[] array, int start, int end) {
        if(start < end) {
            int middle = (start + end)/2;
            mergeSort(array, start, middle);
            mergeSort(array, middle+1, end);
            mergeSortedArrays(array, start, middle , end);
        }
    }

    static void mergeSortedArrays(int[] array, int start, int middle, int end) {
        int l1 = middle - start + 1;
        int[] leftArray = new int[l1];
        for (int i = 0; i < l1; i++) {
            leftArray[i] = array[start + i];
        }
        int l2 = end - middle;
        int[] rightArray = new int[l2];
        for (int j = 0; j < l2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }
        int i = 0, j = 0;
        int k = start;
        while(i < l1 && j < l2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < l1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < l2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i=0; i < length; i++) {
            array[i]=sc.nextInt();
        }
        mergeSort(array, 0, length - 1);
//        for(int i=0; i< array.length; i++) {
//            System.out.print(array[i]+" ");
        System.out.println(Arrays.toString(array));
        }
    }
