package CodingTest_ZeroBase.Week1;

public class Ex4 {

    static int cnt = 0;
    static int num =1;
    public static void divide(int[][] arr, int n, int cnt){
        if (n!=2){
            n/=2;

            divide(arr, n, ++cnt);
            divide(arr, n, ++cnt);
            divide(arr, n, ++cnt);
            divide(arr, n, ++cnt);

        }else {
            int x = arr.length;
            if (cnt==1) {
                arr[0][x-1] = num++;
                arr[0][x-2] = num++;
                arr[1][x-2] = num++;
                arr[1][x-1] = num++;

            } else if (cnt ==2) {
                arr[0][x-3] =num++;
                arr[0][x-4] =num++;
                arr[1][x-4] =num++;
                arr[1][x-3] =num++;

            } else if (cnt==3) {
                arr[2][x-3] =num++;
                arr[2][x-4] =num++;
                arr[3][x-4] =num++;
                arr[3][x-3] =num++;

            } else if (cnt==4) {
                arr[2][x-1] =num++;
                arr[2][x-2] =num++;
                arr[3][x-2] =num++;
                arr[3][x-1] =num++;

            } else if (cnt==5) {
                arr[0][x-5] = num++;
            }

        }
    }
    public static void main(String[] args) {
        int n = 4;
        /*int i = 1;
        int j = 3;*/

        int answer = 0;
        int[][] arr = new int[n][n];
        divide(arr,n,cnt);
        System.out.println(num);

        System.out.println(arr[1][3]);
    }
}
