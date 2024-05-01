package CodingTestExam.Week2;

import java.util.HashSet;
import java.util.Set;

public class Test2_1 {
    public static void main(String[] args) {
        String s = "221123";
        String answer = "";
        String result = "";
        String[] arr = s.split("");
        Set<String> set = new HashSet<>();
        for (int i = 0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
        int[] cnt = new int[10];
        for (int i = 0; i< arr.length; i++){
            cnt[Integer.parseInt(arr[i])]++;
        }
        for (int i =0; i<cnt.length;i++){
            if(cnt[i]==0){
                result+=Integer.toString(i);
                result+=" ";
            }
        }

        for (int i = 0; i< set.size(); i++) {
            int max=-1;
            int idx = -1;
            for (int j = 0; j < cnt.length; j++) {
                if (cnt[j] > max) {
                    max = cnt[j];
                    idx = j;
                }
            }
            answer+=Integer.toString(idx);
            answer+=" ";
            cnt[idx] = 0;
        }

        answer = answer+result;
        answer.trim();

        System.out.println(answer.trim());
    }
}
