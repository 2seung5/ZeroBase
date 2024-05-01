package CodingTestExam.Week2;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr ={5,19,4,23,198,34};
        int answer = 0;
        Arrays.sort(arr);

        for (int i = 0; i< arr.length-2; i++){
            if (arr[i+2]<arr[i+1]+arr[i]){
                answer = arr[i+2]+arr[i+1]+arr[i];

            }
        }
        System.out.println(answer);
    }
}
