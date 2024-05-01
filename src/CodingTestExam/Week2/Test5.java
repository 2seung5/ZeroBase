package CodingTestExam.Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 8, 4};
        int[] arr2 = {2, 4, 6, 8};


        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i< arr1.length; i++){
            list1.add(arr1[i]);
        }
        for (int i = 0; i< arr2.length; i++){
            list2.add(arr2[i]);
        }
        list1.retainAll(list2);
        System.out.println(list1.size());
        int[] answer = new int[list1.size()];
        for (int i = 0; i<list1.size(); i++){
            answer[i] = list1.get(i);
        }
        Arrays.sort(answer);
        for (int i = 0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
