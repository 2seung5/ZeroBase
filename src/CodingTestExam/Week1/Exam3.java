package CodingTestExam.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exam3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());

        String s = br.readLine();
        String[] arr = s.split(" ");
        int target;
        target = Integer.parseInt(br.readLine());
        int cnt =0;
        for (int i = 0; i <arr.length; i++){
            if (Integer.parseInt(arr[i]) == target){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
