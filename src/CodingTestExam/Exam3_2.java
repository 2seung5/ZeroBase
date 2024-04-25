package CodingTestExam;

import java.util.Stack;

public class Exam3_2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        int answer = 1;
        String s = "(()){[<>]";
        String[] arr = s.split("");
        for (int i = 0; i<s.length(); i++){
            if(arr[i].equals("(")|| arr[i].equals("{")||arr[i].equals("<")||arr[i].equals("[")){
                stack.push(arr[i]);
            }else if(arr[i].equals(")")&&stack.peek().equals("(")){
                stack.pop();
            }else if(arr[i].equals("]")&&stack.peek().equals("[")){
                stack.pop();
            }else if(arr[i].equals("}")&&stack.peek().equals("{")){
                stack.pop();
            }else if(arr[i].equals(">")&&stack.peek().equals("<")){
                stack.pop();
            }else {
                answer = 0;
                break;
            }

        }
        if (!stack.isEmpty())
            answer=0;

        System.out.println(answer);

    }
}
