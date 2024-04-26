package CodingTestExam;

public class Exam4_5 {
    public static void main(String[] args) {
        String[] arr = {"naver","kakao","samsung"};
        String answer = "";
        for (int i = 0; i<arr.length-1; i++){
            answer += arr[i]+",";
        }
        answer+=arr[arr.length-1];
        System.out.println(answer);
    }
}
