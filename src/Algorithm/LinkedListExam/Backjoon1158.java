package Algorithm.LinkedListExam;

import java.util.*;
import java.util.LinkedList;
public class Backjoon1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int K;
        N = sc.nextInt();
        K = sc.nextInt();
        LinkedList<Integer> li = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        result.append('<');

        for (int i = 1; i<= N; i++){
            li.add(i);

        }

        for (int i = 0; i< N; i++){
            for (int j = 0; j< K; j++){
                if (j==K-1){
                    int tmp = li.remove();
                    result.append(tmp);
                    if(!li.isEmpty()){
                        result.append(", ");
                    }

                } else {
                    int tmp = li.remove();
                    li.add(tmp);
                }
            }
        }

        result.append('>');
        System.out.print(result);

    }

}
