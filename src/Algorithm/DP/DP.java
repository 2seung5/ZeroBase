package Algorithm.DP;
//피보나치 수열 두가지 방법으로 풀기
//1. 타뷸레이션 2. 메모이제이션
public class DP {

    //기본풀이 O(n^2)
    public static int fib(int n){
        if(n<=1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }


    //1.타뷸레이션 - 기본적으로 반복문기반 -O(N)
    public static int fibDP1(int n){
        int[] dp = new int[n<2? 2: n+1];
        dp[0]=1;
        dp[1]=1;

        for (int i = 2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    //2. 메모이제이션 기본적으로 재귀함수 기반 - O(N)
    static int[] dp = new int[8];
    public static int fibDP2(int n){
        if(n<=2){
            return 1;
        }
        if (dp[n]!=0){
            return dp[n];
        }

        dp[n] =fibDP2(n-1)+fibDP2(n-2);
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(fibDP1(7));
        System.out.println(fibDP2(7));
    }
}
