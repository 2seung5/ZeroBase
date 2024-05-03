package CodingTestExam.Week2;

public class Test3_1 {
    public static void main(String[] args) {
        int[] useageArr = {1,3,5};
        int fee = 5;
        int answer =0;
        for (int i = 0; i<useageArr.length;i++)
            answer+=useageArr[i];
        answer*=fee;
        System.out.println(answer);
    }
}
