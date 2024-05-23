package CodingTest_ZeroBase.Week3;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int answer = 0;
        int[] numbers = {0,2,4};
        int target = 0;

        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();

        if (target==0){
            for (int i = 0; i<numbers.length; i++){
                if (numbers[i] == 0){
                    answer = 1;
                    break;
                }
            }
        }else {

            for (int i = numbers.length - 1; i >= 0; i--) {
                if (numbers[i] != 0 && numbers[i] != 1 && numbers[i] <= target && target % numbers[i] == 0) {
                    while (target % numbers[i] == 0) {
                        list.add(numbers[i]);
                        answer++;
                        target /= numbers[i];
                    }
                }
            }
            System.out.println(list);

            for (int i = numbers.length - 1; i >= 0; i--) {
                if (numbers[i] != 0) {
                    while (target - numbers[i] >= 0) {
                        answer++;
                        System.out.println(answer);
                        target -= numbers[i];
                    }
                }
            }

            if (target != 0) {
                answer = -1;
            }
        }

        System.out.println(answer);
    }
}
