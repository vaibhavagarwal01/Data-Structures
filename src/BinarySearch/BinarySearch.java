package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length - 1;
        while(lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            else if(target < arr[mid]) {
                upper = mid - 1;
            }
            else if(target > arr[mid]){
                lower = mid + 1;
            }
        }
        return -1;
    }
}
