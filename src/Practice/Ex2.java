package Practice;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        while(cnt <= 10){

            int answer = 0;

            int N;
            N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i<N; i++){
               arr[i] = sc.nextInt();
            }
            for (int i = 2; i<N-2; i++){
                int max = -1;
                if (arr[i-2]>max)
                    max = arr[i-2];
                if (arr[i-1]>max) {
                    max = arr[i-1];
                }
                if (arr[i+1]>max) {
                    max = arr[i+1];
                }
                if (arr[i+2]>max) {
                    max = arr[i+2];
                }
                if (arr[i]>max) {
                    answer += arr[i] - max;
                }
            }

            System.out.println("#"+cnt+" "+answer);
            cnt++;
        }
    }
}
