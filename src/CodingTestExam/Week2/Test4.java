package CodingTestExam.Week2;

import java.util.HashSet;

public class Test4 {
    public static void main(String[] args) {
        String s = "Hello world Nice world";
        int answer = 0;
        String[] arr = s.split(" ");
        HashSet<String> set = new HashSet<>();
        for (String a: arr){
            set.add(a);
        }
        answer = set.size();
        System.out.println(answer);
    }
}
