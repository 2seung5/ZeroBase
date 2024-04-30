package CodingTestExam.Week1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String[] s= new String[n];
        for (int i =0; i<n; i++){
            s[i]= sc.next();
        }
        String[][] arr = new String[n][];
        for (int i = 0; i<s.length; i++){
            arr[i] = s[i].split("");
        }


        Stack stack = new Stack();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
               if (arr[i][j].equals("(")){
                   stack.push("(");


               }else if(arr[i][j].equals(")")  && !stack.isEmpty()){
                   stack.pop();
               }else{
                   stack.push(")");
                   break;
               }
            }

            if (stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
