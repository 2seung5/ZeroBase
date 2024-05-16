package CodingTest_ZeroBase.Week2;

import java.util.LinkedList;
import java.util.Queue;

public class Ex4 {
    public static void main(String[] args) {
        int delay = 5;
        int capacity =5;
        int[] times = {3,2,0,0,2,3,0,0,2,2,5};
        int answer = 0;
        int time = times[0];
        int cnt = 0;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i<times.length; i++){
            cnt++;
            if (cnt == time){
                if (cnt%delay==0) {
                    q.poll();
                }
                if (q.size()<capacity){
                    q.add(1);
                    for (int tmp = i+1;  tmp<times.length; tmp++){
                        if (times[tmp]==0){
                            if (q.size()<capacity) {
                                System.out.println(times[tmp]+"ddd"+tmp);
                                q.add(1);

                            }
                            else{
                                System.out.println(answer + "qqqqqqqq");
                                answer++;
                            }

                            System.out.println(i);
                            System.out.println(q.size());
                        }else {
                            System.out.println("bbbbbbbb"+i);
                            break;
                        }
                    }
                }else {
                    System.out.println("cccccccc");
                    answer++;
                }
                time += times[i];
            } else {
                i--;
            }
            //System.out.println(q+"xxxxxxxxx");
        }
        System.out.println(answer);

    }
}
