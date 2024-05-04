package CodingTestExam.Week2;

import java.util.Arrays;

public class Test4_2 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int K = 1;
        int answer = 0;

        int[] arr = new int[A.length * (A.length - 1)];
        String s = "";

        int k = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j) continue;
                s = Integer.toString(A[i]) + Integer.toString(A[j]);
                arr[k] =Integer.parseInt(s);
                k++;
            }
        }

        Arrays.sort(arr);
        answer = arr[arr.length-2];

        System.out.println(answer);
    }
}
