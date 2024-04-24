package CodingTestExam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam2_1 {
    public static void main(String[] args) {
        int n =5;
        String s ="snowball";
        String[] arr = s.split("",s.length());
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        Queue<String> q = new LinkedList<String>();
        for (int i = 0; i<n; i++){
            q.add(".");
        }
        for (int i = 0; i<t; i++){
            if(t <= s.length()) {
                q.add(arr[i]);
                q.poll();
            }else {
                q.add(".");
                q.poll();
            }

        }

    }
}
