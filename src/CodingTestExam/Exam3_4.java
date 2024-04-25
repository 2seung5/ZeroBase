package CodingTestExam;

public class Exam3_4 {
    public static void main(String[] args) {
        int answer = 0;
        String s= "34333";
        String[] digit = s.split("\\D+");
        String[] nonDigit = s.split("\\d+");

        String[] arr = s.split("");
        if(s.length()==1){
            answer = Integer.parseInt(digit[0]);
        }else if(arr[0].equals("+")||arr[0].equals("-")) {
            for (int i = 0; i < digit.length - 1; i++) {
                if (nonDigit[i].equals("-")) {
                    answer -= Integer.parseInt(digit[i + 1]);
                } else {
                    answer += Integer.parseInt(digit[i + 1]);
                }
            }
        } else {

            for (int i = 0; i < digit.length; i++) {
                if (nonDigit[i].equals("-")) {
                    answer -= Integer.parseInt(digit[i]);
                } else if(nonDigit[i].equals("+")){
                    answer += Integer.parseInt(digit[i]);
                }
            }
        }
        System.out.println(answer);
    }
}
