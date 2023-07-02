package JavaInterviewQuestions.Collections;

import Sorting.InsertionSort;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImplementation {

    static void printList(ArrayList<Integer> arr) {
        int size = arr.size();
        for (int i = 0; i < size; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(34);
//        arr.add(45);
//        arr.add(21);
//        arr.add(2345);
//        System.out.println(arr);
//
//        printList(arr);
//
//        arr.remove(2);
//        printList(arr);
//
//        arr.set(1, 100);
//        printList(arr);
//
//        System.out.println(arr);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.add(50);
        System.out.println(list);

        list.add(4,23);
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(78);
        newList.add(39);

        list.addAll(newList);
        System.out.println(list);

        list.addAll(3,newList);
        System.out.println(list);

        System.out.println(list.get(5));

        // Ways to print an ArrayList

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
      //for(datatype of the arraylist item : arraylist)
        for (Integer element : list) {
            System.out.println(element);
        }
        System.out.println();
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //it is used to set a particular index to a particular value
        list.set(5,20006);
        System.out.println(list);


        // It checks whether the given element is present in the array list or not
        System.out.println(list.contains(50));
        System.out.println(list.contains(12456));

        list.remove(6);
        System.out.println(list);

        list.remove(Integer.valueOf(20006));
        System.out.println(list);

        newList.clear();
        System.out.println(newList);


    }
}
