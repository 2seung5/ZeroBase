package CodingTest_ZeroBase.Week2;

import java.util.LinkedList;
import java.util.Queue;

public class Ex3 {
    public static void main(String[] args) {
        String code = "f2{a3{bc}}z";
        String answer = "";
        String[] arr = code.split("");
        int re = 0;
        Queue<String> q = new LinkedList<>();

        for (int i = 0; i< arr.length; i++){
            q.add(arr[i]);
        }
        while (!q.isEmpty()){
            if (q.peek().charAt(0)>=97 && q.peek().charAt(0)<=122){

            }
        }
        /*if (arr[i].charAt(0)>=97 && arr[i].charAt(0)<=122){

        } else if (arr[i].charAt(0)==123) {

        } else {
            re = Integer.parseInt(arr[i]);
        }

        System.out.println(answer);*/
    }
}
