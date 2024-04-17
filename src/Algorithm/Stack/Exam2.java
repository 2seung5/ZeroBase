package Algorithm.Stack;
import java.util.*;
public class Exam2 {

    public static class Solution {
        public int[] solution(int []arr) {

            Stack<Integer> stack = new Stack<Integer>();
            for(int i = 0; i < arr.length; i++){
                if(i==0){
                    stack.push(arr[i]);
                }
                else if(stack.peek()!=arr[i]){
                    stack.push(arr[i]);
                }
            }
            int[] answer = new int[stack.size()];

            /*for(int i=0; i< stack.size(); i++){
                answer[stack.size()-i-1] = stack.pop();
            }*/
            for(int i=stack.size()-1; i>=0; i--){
                answer[i] = stack.pop();
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,4,1};
        Solution solution = new Solution();

        int arrRe [] = solution.solution(arr);
        for (int i = 0; i < arrRe.length; i++){
            System.out.println(arrRe[i]);
        }
    }
}
