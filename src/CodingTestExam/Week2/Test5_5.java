package CodingTestExam.Week2;

public class Test5_5 {

    public static void main(String[] args) {
        int[] arr = {0,20,22,25,27,29,30};
        String answer = "YES";

        for (int i = 1; i<arr.length; i++){
            if(2*i<arr.length&& arr[i]>arr[2*i]){
                answer = "NO";
            }
            if(2*i+1<arr.length&& arr[i]>arr[2*i+1]) {
                answer = "NO";
            }
        }
        System.out.println(answer);
    }
}
