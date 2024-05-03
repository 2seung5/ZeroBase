package CodingTestExam.Week2;

public class Test3_2 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,4,3,0};
        int[] answer = new int[arr.length];
        int cnt = 0;
        int tmp = 0;
        int temp = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]%2!=0){

                temp = cnt+i;
                cnt++;
                if (temp<arr.length)
                    answer[temp] =arr[i];
                for (int j = i; j<arr.length-1;j++){
                    if (j+cnt<arr.length)
                        answer[j+cnt] =arr[j];
                }
            }else {
                tmp = cnt+i;
                if(tmp<arr.length) {
                    answer[tmp] = arr[i];

                }
            }
        }

        for (int j : answer) System.out.println(j);
    }
}
