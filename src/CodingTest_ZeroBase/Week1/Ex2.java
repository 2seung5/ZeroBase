package CodingTest_ZeroBase.Week1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        String[] names = {"제로","베이스","자바","스쿨","자바","베이스","베이스","백엔드","화이팅"};
        int answer = 1;

        Set<String> set = new HashSet<>();
        Collections.addAll(set, names);

        for (int i = set.size(); i> set.size()-4; i--){
            answer *= i;
        }
        answer /= 24;

        System.out.println(answer);
    }
}
