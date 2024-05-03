package CodingTestExam.Saffy;

import java.util.Scanner;

public class Prob1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int N;

        for (int i = 1; i<=T; i++){
            N = sc.nextInt();
            int[] score = new int[1000];
            int[] cnt = new int[101];
            for (int j = 0; j<10; j++){
                score[j] = sc.nextInt();
            }

            for (int j = 0; j<10; j++){
                cnt[score[j]]++;
            }
            System.out.println(cnt[1]);
            System.out.println(cnt[3]);
            System.out.println(cnt[5]);
            int max = -1;
            int result=-1;
            for (int j = 0; j<=100; j++){
                if (cnt[j]>=max){
                    max = cnt[j];
                    result = j;
                }
            }
            System.out.println("#"+i+" "+result);
        }
    }
}
