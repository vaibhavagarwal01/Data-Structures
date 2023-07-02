// order agnostic array means that we don't know that array is sorted in ascending order or in descending order
// so first we find the way it is sorted then apply binary search
package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length - 1;
        boolean isAsc = arr[lower] < arr[upper];
        while(lower <= upper) {
            int mid = (lower + upper) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            else if (isAsc) {
                if (target < arr[mid]) {
                        upper = mid - 1;
                    }
                else {
                        lower = mid + 1;
                    }
                }
                else {
                    if(target < arr[mid]) {
                        lower = mid + 1;
                    }
                    else {
                        upper = mid - 1;
                    }
                }
        }
        return -1;
    }
}
