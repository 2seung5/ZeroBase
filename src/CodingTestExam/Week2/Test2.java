package CodingTestExam.Week2;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {9,4,7,5,10,4};
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 1; i<arr.length-1; i++){
            answer+=arr[i];
        }
        System.out.println(answer/(arr.length-2));
    }
}
