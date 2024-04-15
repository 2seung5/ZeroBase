package MiniExam;

import java.util.Arrays;

//이승호
public class Mini01 {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        for (int i = 1; i <10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(String.format("%02d",j)+" x "+String.format("%02d",i)+" = "+String.format("%02d",i*j));
                System.out.print("\t");
            }
            System.out.println();
        }
        int num = 0;
        int arr[][] = new int[5][7];
        for (int i =0; i<5;i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = num;
                num++;
            }
        }
        for (int i =0; i<5;i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
        String arrs[] = new String[4];
        arrs[0] = "\t";
        arrs[1]= "2";
        for (int i =0; i<4;i++)
            System.out.print(arrs[i]);
    }
}
