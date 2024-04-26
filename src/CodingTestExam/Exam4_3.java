package CodingTestExam;

public class Exam4_3 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 10;

        for (int i = 1; i<=n; i++){
            if (n%i==0)answer++;
        }

        System.out.println(answer);
    }
}
