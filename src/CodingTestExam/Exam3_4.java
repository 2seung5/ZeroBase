package CodingTestExam;

public class Exam3_4 {
    public static void main(String[] args) {
        int answer = 0;
        String s= "3+26-7";
        String[] digit = s.split("\\D+");
        String[] nonDigit = s.split("\\d+");
        System.out.println(digit[0]);
        String[] arr = s.split("");
        if(arr[0].equals("+")||arr[0].equals("-")) {
            for (int i = 0; i < digit.length - 1; i++) {
                if (nonDigit[i].equals("-")) {
                    answer -= Integer.parseInt(digit[i + 1]);
                } else {
                    answer += Integer.parseInt(digit[i + 1]);
                }
            }
        }else {
            for (int i = 0; i < digit.length; i++) {
                if (nonDigit[i].equals("-")) {
                    answer -= Integer.parseInt(digit[i]);
                } else {
                    answer += Integer.parseInt(digit[i]);
                }
            }
        }
        System.out.println(answer);
    }
}
