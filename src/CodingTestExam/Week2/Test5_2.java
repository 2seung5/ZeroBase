package CodingTestExam.Week2;

public class Test5_2 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,3,2};
        int n = -1;
        int answer = -1;

        for (int i = 0; i< nums.length; i++){
            if (nums[i]==n){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
