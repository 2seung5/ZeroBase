package CodingTestExam.Week2;

import java.util.*;

public class Test2_2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,6,6};


        Set<Integer> set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i<nums.length; i++){
            set.add(nums[i]);
            list1.add(i+1);
        }
        List<Integer> list2 = new ArrayList<>(set);
        list1.removeAll(list2);
        int[] answer = new int[list1.size()];
        for (int i = 0; i<answer.length; i++){
            answer[i] =list1.get(i);
        }

        System.out.println(answer[2]);
    }
}
