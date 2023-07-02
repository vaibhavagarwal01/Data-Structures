/*
A
B B
C C C
D D D D
E E E E E
F F F F F F
 */
package Pattern.AlphabetPattern;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }

    }
}
