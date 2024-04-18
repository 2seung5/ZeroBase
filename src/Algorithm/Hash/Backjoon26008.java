package Algorithm.Hash;

import java.util.Scanner;

public class Backjoon26008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        int a;
        int h;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        h = sc.nextInt();

        long answer = 1L;
        for (int i = 0; i< n-1; i++){
            answer = (answer*m)%1000000007;
        }
        System.out.println(answer);
    }
}
