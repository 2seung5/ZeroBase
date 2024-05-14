package Misson;


import java.util.Scanner;

public class Ex2 {

    static int[] inputData(){
        Scanner input = new Scanner(System.in);
        String a;

        a = input.next();
        int[] arr = new int[2];
        arr[0] = Integer.parseInt(a.substring(0, a.indexOf(',')));
        arr[1] = Integer.parseInt(a.substring(a.indexOf(',') + 1, a.length()));

        return arr;
    }
    static int distance(int[] myCoor, int[] coordinate){
        int x = Math.abs(myCoor[0]- coordinate[0]);
        int y = Math.abs(myCoor[1]- coordinate[1]);
        return (int) Math.pow(x,y);
    }

    static boolean check(int[][] coordinate, int[][] check, int n){
        boolean a = true;
        for (int i = 0; i<n; i++){
            if (coordinate[i][0] == check[0][0] && coordinate[i][1] == check[0][1]){
                a = false;
            }
        }
        return a;
    }
    public static void main(String[] args) {


        int[][] myCoor = new int[1][2];
        System.out.print("나의 좌표를 입력하세요 x,y형식 : ");

        myCoor[0] = inputData();

        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("입력할 임의의 좌표의 개수를 입력하세요 : ");
        N = sc.nextInt();

        int[][] coordinate = new int[N][2];
        int[][] check = new int[1][2];

        int cnt = 0;


        while (cnt<N){
            System.out.print("임의 좌표 입력해 주세요 : ");
            check[0] = inputData();
            if (check(coordinate,check, cnt)){
                coordinate[cnt][0] = check[0][0];
                coordinate[cnt][1] = check[0][1];
                cnt++;
            }else {
                System.out.println("동일한 좌표가 있습니다. 다시 입력하세요");
            }
        }
        int min = Integer.MAX_VALUE;
        int[][] minCoor = new int[1][2];
        for (int i = 0; i<N; i++){
            if (distance(myCoor[0], coordinate[i]) < min){
                min = distance(myCoor[0], coordinate[i]);
                minCoor[0][0] = coordinate[i][0];
                minCoor[0][1] = coordinate[i][1];
            }
        }
        System.out.println("나의 가장 가까운 좌표값은 " + minCoor[0][0]+","+minCoor[0][1]+" 입니다.");

    }
}
