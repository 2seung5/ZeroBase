package CodingTestExam.Week1;

import java.util.ArrayList;

public class Exam3_5 {
    public static void main(String[] args) {
        String answer = "";
        String[] bj = {"혁준", "하밥", "양상", "심심이", "소스왕"};
        String[] one = {"혁준", "양상"};
        String[] two = {"심심이", "소스왕"};

        int price = (one.length+two.length*2+(bj.length-one.length-two.length)*3)*150;
        ArrayList<String> list = new ArrayList<>();
        String[] arr = new String[bj.length];
        for (int i = 0; i<bj.length; i++){
            for (int j = 0; j<one.length; j++){
                if(bj[i].equals(one[j])){
                    bj[i] = "a";
                }
            }
        }
        for (int i = 0; i<bj.length; i++){
            for (int j = 0; j<two.length; j++){
                if(bj[i].equals(two[j])){
                    bj[i] = "a";
                }
            }
        }
        String result = "";
        for (int i = 0; i<bj.length; i++){
            if(!bj[i].equals("a")){
                result = bj[i];
            }
        }
        answer = price+"만원("+result+")";
        System.out.println(answer);

    }
}
