package Algorithm.BackTracking;

public class N_Queen {
    static int n = 4;
    static int[] board = new int[n];
    //각 행에 몇번째 위치해놓는지 적어놓는 배열 nxn행렬볻바 메모리가 적게듬

    static int cnt;
    public static int nQueen(int row){

        if (row == n){
            cnt++;
            for (int i = 0; i<n; i++){
                System.out.print(board[i]+ " ");
            }
            System.out.println();
            return cnt;
        }

        for (int i = 0; i < n; i++){
            board[row] = i;

            //promising
            if (isPromising(row)){
                nQueen(row+1);
            }
        }
        return cnt;
    }

    public static boolean isPromising(int row){
        for (int i = 0; i < row; i++) {
            if (board[row] == board[i] || row - i ==Math.abs(board[row]-board[i])){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(nQueen(0));
    }
}
