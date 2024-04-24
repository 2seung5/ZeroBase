package CodingTestExam;

import java.util.Arrays;

public class Exam2_2 {
    public static void main(String[] args) {
        String s = "Hello, World!?";
        String arr[] = s.split("\\. |, |\\?|!| ");
        String[] answer = new String[arr.length];
        for (int i  =0; i< arr.length; i++){
            StringBuffer sb = new StringBuffer(arr[i]);
            String reverse = sb.reverse().toString();
            answer[i] =reverse;
        }

        System.out.println(answer[0]);
    }
}
