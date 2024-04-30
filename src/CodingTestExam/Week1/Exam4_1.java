package CodingTestExam.Week1;

public class Exam4_1 {
    public static void main(String[] args) {
        int[] arr = {71, 111, 111, 103, 108, 101};
        String answer = "";
        char[] a = new char[arr.length];
        for (int i = 0; i< arr.length; i++){
            a[i] = (char)arr[i];
        }
        answer = String.valueOf(a);
        System.out.println(answer);
    }
}
