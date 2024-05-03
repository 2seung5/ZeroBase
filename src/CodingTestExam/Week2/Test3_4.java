package CodingTestExam.Week2;

import java.util.Stack;

public class Test3_4 {
    public static void main(String[] args) {
        int[] arr = {44,45,44};
        int answer = 0;

        int[] cnt = new int[100000];
        for (int i = 0; i<arr.length; i++){
            cnt[arr[i]]++;
        }
        for (int i = 0; i<cnt.length; i++){
            if (cnt[i]==1){
                answer = i;
            }
        }


        System.out.println(answer);
    }
}
