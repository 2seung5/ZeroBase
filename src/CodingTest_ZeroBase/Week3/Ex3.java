package CodingTest_ZeroBase.Week3;

import Algorithm.Stack.Exam2;

public class Ex3 {
    static int answer = 1;
    public static int solution(int delay, int N){
        if (N>0){
            solution(delay, N-1);
            solution(delay, N-delay-1);
            answer++;
            answer++;
        }else {
            return 0;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(2,5));
    }
}
