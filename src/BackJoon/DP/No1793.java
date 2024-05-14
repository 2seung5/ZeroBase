package BackJoon.DP;

import java.util.Scanner;

public class No1793 {
    public static void main(String[] args) {

        int[] dp = new int[251];
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i<251; i++){
            dp[i] = 2*dp[i-2] + dp[i-1];
        }
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n=sc.nextInt();
            System.out.println(dp[n]);
        }


    }
}
