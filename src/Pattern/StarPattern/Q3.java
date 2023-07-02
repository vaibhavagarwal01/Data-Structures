/*

 *
 * *
 * * *
 * * * *
 * * * * *

 */

package Pattern.StarPattern;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k;
        for(i = 0; i < n; i++) {
            for(j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for(k = j; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
