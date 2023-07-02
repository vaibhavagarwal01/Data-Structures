package LinearSearch;
import java.util.*;
public class LinearSearch {

    static int search(int[] arr, int target) {
        if(arr.length == 0)
            return -1;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == target)
                return index;
        }
        // if the element is not found in the array
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 5, 6, -8, 75};
        int target = -8;
        System.out.println(search(arr, target));


    }
}
