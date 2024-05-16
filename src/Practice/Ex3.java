package Practice;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        for (int i = 1; i<=N; i++){
            String num;
            num = sc.next();
            int swap;
            swap = sc.nextInt();

            String[] arr = num.split("");
            int[] price = new int[arr.length];
            for (int j = 0; j<arr.length; j++){
                price[j] = Integer.parseInt(arr[j]);
            }

            for (int p = 0; p<swap; p++) {
                int max = -1;
                int maxIdx = -1;
                for (int k = 0; k < price.length; k++) {
                    if (price[k] > max) {
                        max = price[k];
                        maxIdx = k;
                    }
                }

            }

        }
    }
}
