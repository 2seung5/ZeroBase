package BackJoon.BruteForce;

import java.util.Scanner;

public class BF1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int i = 0;
        for (int j = 0; j < Integer.MAX_VALUE; j++) {
            if (String.valueOf(j).contains("666")) {
                if(i>=N)break;
                arr[i++] = j;
            }
        }
        System.out.println(arr[N-1]);

    }
}
