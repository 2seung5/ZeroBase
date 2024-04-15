package Practice;

public class Exam1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int even=0;
        int odd=0;
        int evencnt=0;
        int oddcnt=0;
        for (int i =0 ; i< arr.length; i++){
            if (arr[i]%2==0) {
                even += arr[i];
                evencnt++;
            }
            else {
                odd += arr[i];
                oddcnt++;
            }
        }
        System.out.println(oddcnt);
        System.out.println("짝수 : " +even/evencnt + "홀수 : " +odd);
    }
}
