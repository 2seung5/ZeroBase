package CodingTest_ZeroBase.Week1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        int[] cnt = new int[N+1];
        cnt[0] = 1;
        cnt[1] = 1;

        for (int i =2; i<= N; i++){
            cnt[i] = cnt[i-1]+cnt[i-2];
        }

        System.out.println(cnt[N]);
    }
}
