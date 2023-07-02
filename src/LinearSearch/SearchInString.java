package LinearSearch;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        String s = "Vaibhav";
        char target = 'a';
        System.out.println(search(s, target));
    }
    static int search(String s, int target) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == target)
                return i;
        }
        return -1;
    }
}
