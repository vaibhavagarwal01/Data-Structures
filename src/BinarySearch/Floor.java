package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        // returns the index of greatest no <= target
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length - 1;
        while( lower <= upper) {
            int mid = (lower + upper)/2;
            if(target == arr[mid])
                return mid;
            else if(target < arr[mid]) {
                upper = mid - 1;
            }
            else if(target > arr[mid]){
                lower = mid + 1;
            }
        }
        return upper;
    }
}
