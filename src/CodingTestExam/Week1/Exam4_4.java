package CodingTestExam.Week1;

public class Exam4_4 {
    public static void main(String[] args) {
        String answer = "";
        String s ="f4";
        int hexaToDemical = Integer.parseInt(s,16);
        answer = Integer.toBinaryString(hexaToDemical);

        System.out.println(answer);
    }
}
