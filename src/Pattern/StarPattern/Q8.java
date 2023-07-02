/*

 *****
 ****
 ***
 **
 *

*/
package Pattern.StarPattern;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k;
        for(i = 0; i < n; i++) {
            for(j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(k = j; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
