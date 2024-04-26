package CodingTestExam;

public class Exam4_2 {
    public static void main(String[] args) {
        int answer = 0;
        String[] arr = {"10110", "1010", "11110"};
        int[] binary = new int[arr.length];
        for (int i = 0; i<arr.length; i++){
            binary[i] = Integer.parseInt(arr[i],2);
        }
        for (int i = 0; i<binary.length; i++){
            answer ^= binary[i];
        }

        System.out.println(answer);
    }
}
