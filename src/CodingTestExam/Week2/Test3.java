package CodingTestExam.Week2;

import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) {
        String p = "나나나나";
        String s = "바 바 바 바 바";
        boolean answer = true;
        String[] arr1 = p.split("");
        String[] arr2 = s.split(" ");
        System.out.println(arr2.length);
        /*HashMap<String, String> map = new HashMap<>();
        map.put(arr1[0],arr2[0]);
        for (int i = 1; i<arr1.length; i++){
            map.put(arr1[i],arr2[i]);
        }
        String result = "";
        for (int i = 0; i<arr1.length-1; i++){
            result+=map.get(arr1[i])+" ";
        }
        result+=map.get(arr1[arr1.length-1]);
        if (!result.equals(s))
            answer=false;*/
        for (int i = 0; i< arr1.length; i++){
            for (int j = i+1; j< arr1.length; j++){
                if(!arr1[i].equals(arr1[j])&&arr2[i].equals(arr2[j])){
                    answer = false;
                }else if(arr1[i].equals(arr1[j])&&!arr2[i].equals(arr2[j])){
                    answer = false;
                }
            }
        }
        if(arr2.length!=4)answer = false;
        System.out.println(answer);
    }
}
