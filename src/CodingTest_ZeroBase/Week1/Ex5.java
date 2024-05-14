package CodingTest_ZeroBase.Week1;

public class Ex5 {

    public static long permutation(int n, int r){
        long result = 1;
        for (int i = n; i>=n-r+1; i--){
            result *= i;
        }
        return result;
    }
    public static long combination(int n, int r){
        long p = 1;
        for (int i = n; i>=n-r+1; i--){
            p *= i;
        }
        long q = 1;
        for (int i = 1; i<=r; i++){
            q*=i;
        }
        return p/q;
    }
    public static void main(String[] args) {
        int N=10;
        int M =3;
        int K=4;
        int[] capacity = {3,3,4};

        long answer = 1;

        if (M==1){
            answer =1;
        } else if (M==2) {
            answer *= combination(N,capacity[0]);
        } else if (M==3) {
            answer *= combination(N,capacity[0]);
            answer *= combination(N-capacity[0],capacity[1]);
        }
        answer *= permutation(K,M);
        System.out.println(answer);


    }
}
