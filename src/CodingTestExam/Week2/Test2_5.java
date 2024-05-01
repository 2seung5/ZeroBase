package CodingTestExam.Week2;

import java.util.LinkedList;

public class Test2_5 {
    public static void main(String[] args) {
        int N = 7;
        int K = 3;
        int answer = 0;

        LinkedList<Integer> li = new LinkedList<>();
        for (int i = 1; i<=N; i++){
            li.add(i);
        }
        for (int i = 0; i<N-1; i++){
            for (int j = 0; j<K; j++){
                if(j==K-1){
                    li.remove();
                }else {
                    int tmp = li.remove();
                    li.add(tmp);
                }
            }
        }

        System.out.println(li.get(0));
    }
}
