package CodingTestExam;

import java.util.ArrayList;
import java.util.Stack;

public class Exam3_1 {
    public static void main(String[] args) {
        String answer = "";
        String s = "aacddefg";
        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");


        for (int i = 0; i<arr.length; i++){
            if(stack.isEmpty()||!arr[i].equals(stack.peek())){
                stack.push(arr[i]);
            }else {
                stack.pop();
            }
        }

        for (int i = stack.size(); i>0; i--){
                answer += stack.pop();
        }
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);

    }

}
