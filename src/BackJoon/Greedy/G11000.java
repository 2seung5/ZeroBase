package BackJoon.Greedy;

import java.util.Scanner;

public class G11000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        int[] T = new int[N];
        for (int i = 0; i< N; i++){
            S[i] = sc.nextInt();
            T[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i<N; i++){
            for (int j = i+1; j<N; j++){
                if (T[i]<=S[j]){
                    cnt++;
                    break;

                }
            }
        }
        System.out.println(cnt);
    }
}
