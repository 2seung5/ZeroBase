package CodingTestExam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam2_1 {
    public static void main(String[] args) {
        int n =5;
        String s ="snowball";
        int len = s.length();
        String[] arr = s.split("",s.length());
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        Queue<String> q = new LinkedList<String>();
        for (int i = 0; i<n; i++){
            q.add(".");
        }

        while (t>0){

            for (int i = 0; i< n+s.length(); i++){
                if(i < s.length()) {

                    q.add(arr[i]);
                    q.poll();
                    t--;
                    if(t<1)break;
                }else{
                    q.add(".");
                    q.poll();
                    t--;
                    if(t<1)break;                }
            }
        }
        String answer="";
        while (!q.isEmpty()){
            answer+=q.poll();
        }

    }
}
