package BackJoon.Implementation;

import java.util.Scanner;

public class Imp1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] arr = s.split("");
        String result = "";

        int j = 0;

        while (j<arr.length){
            int cnt = 0;
            while (arr[j].equals("X")){
                cnt++;
                j++;

                if (j>=arr.length){
                    break;
                }
            }
            if (cnt%2!=0){
                System.out.println(-1);
                return;
            }
            for (int i = 0; i<cnt/4; i++){
                result+="AAAA";
            }
            for (int i = 0; i<cnt%4; i++){
                result +="B";
            }
            if (j<arr.length && arr[j].equals(".")){
                j++;
                result+=".";
            }

        }

        System.out.println(result);

    }
}
