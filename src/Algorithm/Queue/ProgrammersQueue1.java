package Algorithm.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ProgrammersQueue1 {
    public static ArrayList<Integer> solution(int[] progresses, int[] speeds){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] days = new int[progresses.length];
        for (int i = 0; i< days.length; i++){
            days[i] = 0;
        }

        for (int i = 0; i < progresses.length; i++) {
            int cnt=0;
            while (progresses[i]<100){
                progresses[i] += speeds[i];
                cnt++;
                days[i] = cnt;
            }
            System.out.println(days[i]);
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < days.length; i++){
            q.add(days[i]);
        }
        while (!q.isEmpty()){
            int count=0;
            int max = 1000;
            while (!q.isEmpty() && q.peek() <= max){
                    max = q.poll();
                    count++;
            }
            answer.add(count);
        }

        System.out.println(answer);

        return answer;
    }
    public static void main(String[] args) {
        int[] progresses = {95,90,99,99,80,99};
        int[] speeds = {1,1,1,1,1,1};

        for (int i = 0; i< progresses.length; i++){
            progresses[i]++;
            System.out.println(progresses[i]);
        }

    }
}
