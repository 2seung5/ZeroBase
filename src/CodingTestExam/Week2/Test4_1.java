package CodingTestExam.Week2;

public class Test4_1 {
    public static void main(String[] args) {
        int N = 25;
        int k = 2;
        int answer = 0;
        int[] arr = new int[N+1];
        for (int i = 0; i<arr.length; i++){
            arr[i] =i;
        }
        String[] num = new String[N+1];
        for (int i = 0; i<num.length; i++){
            num[i] = Integer.toString(arr[i]);
        }

        for (int i = 0; i<num.length; i++){
            String[] numSplit = num[i].split("");
            for (int j = 0; j<numSplit.length; j++){
                if (Integer.parseInt(numSplit[j])==k){
                    answer++;
                }
            }
        }


        System.out.println(answer);

    }
}
