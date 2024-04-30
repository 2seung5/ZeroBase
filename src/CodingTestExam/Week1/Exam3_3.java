package CodingTestExam.Week1;

import java.util.Stack;

public class Exam3_3 {
    public static void main(String[] args) {
        String s = "ABCA";
        Stack<String> stack = new Stack<String>();
        String[] arr = s.split("");

        for (int i = 0; i<s.length(); i++){
            if(stack.isEmpty()|| !stack.peek().equals(arr[i])){
                stack.push(arr[i]);
            }else {
                stack.pop();
            }
        }
        System.out.println(stack);
    }
}
