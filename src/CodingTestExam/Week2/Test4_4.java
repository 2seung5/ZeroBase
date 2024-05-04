package CodingTestExam.Week2;

public class Test4_4 {
    public static void main(String[] args) {
        int[] nums = {2,5,6,3,2,6,6};
        int answer = 0;

        for (int i = 0; i< nums.length-1; i++){
            for (int j = i+1; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
