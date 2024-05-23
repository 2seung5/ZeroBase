package CodingTest_ZeroBase.Week3;

public class Ex1 {
    public static void main(String[] args) {
        int answer = -1;
        int N=3;
        int[][] trust = {{1,3},{2,3}};

        int[] arr = new int[N+1];
        for (int i = 0; i < trust.length; i++){
            arr[trust[i][1]]++;
        }
        int cnt = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i]==N-1){
                answer = i;
                cnt++;
            }
        }
        if (cnt == 1){
            System.out.println(answer);
        }
        answer = -1;
        System.out.println(answer);
    }
}
