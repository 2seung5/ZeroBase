package CodingTestExam.Week2;

public class Test3_5 {
    public static void main(String[] args) {
        int num = 999911;
        int answer = 0;
        int isMinus = 0;
        if (num<0){
            isMinus = 1;
            num = -num;
        }
        String arr = Integer.toString(num);
        String reverse = "";
        for (int i = arr.length()-1; i>=0; i--){
            reverse = reverse+arr.charAt(i);
        }
        answer = Integer.parseInt(reverse);
        if (isMinus==1)
            answer = -answer;
        if (answer>=100000||answer<=-100000)
            answer = 0;


        System.out.println(answer);
    }
}
