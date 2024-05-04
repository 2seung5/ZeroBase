package CodingTestExam.Week2;

public class Test4_3 {
    public static void main(String[] args) {
        String S1 = "HelloWorld";
        String S2 = "WorldHello";

        int answer = 0;
        int cnt = S1.length();
        for (int i = 0 ; i< cnt; i++){
            S1 = S1.substring(i+1,S1.length())+S1.substring(0,i+1);
            if(S1.equals(S2)){
                answer = 1;
                break;
            }
        }

        System.out.println(answer);
    }
}
