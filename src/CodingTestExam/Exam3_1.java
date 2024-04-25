package CodingTestExam;

import java.util.ArrayList;

public class Exam3_1 {
    public static void main(String[] args) {
        String s = "aacddefg";
        ArrayList<String> list= new ArrayList<String>();
        String[] arr = s.split("");
        for (int i = 0; i<s.length(); i++){
            list.add(arr[i]);
        }

        for (int i = 0; i<list.size()-1; i++){
            if(list.get(i).equals(list.get(i+1))){
                list.remove(i);
                list.remove(i);
            }
        }
        for (int i = 0; i<list.size(); i++){
            System.out.print(list.get(i));
        }

    }

}
