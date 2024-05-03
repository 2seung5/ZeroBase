package CodingTestExam.Week2;

public class Test3_3 {
    public static void main(String[] args) {
        int n = 1000000;
        int answer = 0;

        for (int i = 1; i<=n; i++){
            if (i*i*i<=n)
                answer= i*i*i;
            if(i*i*i>n)
                break;
        }

        System.out.println(answer);
    }
}
