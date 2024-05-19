import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t < T; t++){
            int answer = 0;
            int N;
            N = sc.nextInt();
            int[][] day = new int[2][N];

            for (int i = 0; i<2; i++){
                for (int j = 0; j<N; j++){
                    day[i][j] = sc.nextInt();
                }
            }
            int[] check = new int[N+1];
            int sum = 0;







            System.out.println("#"+t+" "+answer);
        }

    }
}
