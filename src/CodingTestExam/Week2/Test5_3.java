package CodingTestExam.Week2;

import java.util.*;

public class Test5_3 {
    public static void main(String[] args) {
        int[] cards = {4,8,6,1,2};
        int answer = 0;

        Arrays.sort(cards);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< cards.length; i++){
            list.add(cards[i]);
        }
        int tmp;

        while (list.size()>1){

            tmp = list.get(list.size()-1)-list.get(list.size()-2);
            list.remove(list.size()-1);
            list.remove(list.size()-1);
            list.add(tmp);
            Collections.sort(list);
        }
        answer = list.get(0);


        System.out.println(answer);
    }
}
