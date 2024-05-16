package CodingTest_ZeroBase.Week2;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] numbers = {9,4,2,3,7,5};
        int answer = 0;

        Arrays.sort(numbers);
        for (int i = 1; i<numbers.length; i++){
            if (numbers[i] != numbers[i-1]+1){
                answer = numbers[i-1] +1;
                break;
            }
        }

        System.out.println(answer);
    }
}
