// https://leetcode.com/problems/richest-customer-wealth

package LinearSearch;

public class Wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5} };
        System.out.println(maxWealth(accounts));

    }
    static int maxWealth(int[][] accounts) {
        int ans = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum +accounts[i][j];
            }
            if(sum > ans)
                ans = sum;
        }
        return ans;
    }

}
