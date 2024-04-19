package Algorithm.Array;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BackJoon10818 {
    public static void main(String[] args) throws IOException {
        //버퍼드리더 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        int max =-999999999;
        int min = 999999999;

        for (int i = 0; i< n; i++){
            if (Integer.parseInt(arr[i])> max){
                max = Integer.parseInt(arr[i]);
            }
            if (Integer.parseInt(arr[i]) < min){
                min = Integer.parseInt(arr[i]);
            }
        }

        System.out.print(min+" "+max);
        //스캐너 이용
        /* Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0]+" "+arr[arr.length-1]);*/
        /*int max =-999999999;
        int min = 999999999;
        for (int i = 0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.print(min+" "+max);*/

    }
}
