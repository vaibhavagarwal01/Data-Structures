package LinearSearch;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28, -5689, 56892};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];

        }
        return min;
    }
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];

        }
        return max;
    }
}
