package CodingTestExam.Week2;

public class Test5_4 {
    public static void main(String[] args) {
        int n = 6541;
        int answer = 1;


        for (int i = 1; i<=n; i++){
            answer *=2;
            if (answer>=1000000007){
                answer%=1000000007;
            }
        }
        answer-=1;

        System.out.println(answer);
    }
}
