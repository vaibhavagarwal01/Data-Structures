/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */
package Pattern.NumericPattern;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j >=1  ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
