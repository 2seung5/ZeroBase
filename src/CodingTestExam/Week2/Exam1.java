package CodingTestExam.Week2;

import java.util.HashMap;

public class Exam1 {
    public static void main(String[] args) {
        String s = "dbceaaaaaaadzxcvawrhasrtgjs";
        String[] arr = s.split("");
        String answer = "";

        HashMap<String, Integer> hm = new HashMap<>();
        for (String key : arr){
            hm.put(key, hm.getOrDefault(key,0)+1);
        }
        for (String key : hm.keySet()){
            if(hm.get(key)==1){
                answer+=key;
            }
        }

        System.out.println(answer);
    }
}
