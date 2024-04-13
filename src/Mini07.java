//이승호
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mini07 {

    public static int[] lottoRandom(){
        Random random = new Random();
        int[] lotto = new int[6];
        for (int i = 0; i<6; i++){
            lotto[i] = random.nextInt(44)+1;
            //중복제거
            for (int j = 0; j<i; j++){
                if(lotto[j] == lotto[i]){
                    i--;
                    break;
                }
            }
        }

        //오름차순 정렬
        for (int i =0; i<lotto.length; i++){
            for (int j =i+1; j<lotto.length; j++){
                if (lotto[i]>lotto[j]){
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }
        return lotto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lottNum;

        System.out.println("[로또 당첨 프로그램]");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1~10): ");
        lottNum = sc.nextInt();
        //산 로또 번호 출력
        int [][] myLotto = new int[lottNum][6];

        for (int i = 0; i < myLotto.length; i++){
            myLotto[i] = lottoRandom();
        }

        for (int i = 0; i<lottNum; i++){
            System.out.print((char)('A'+i)+"\t");
            System.out.println(Arrays.toString(myLotto[i]));
        }

        //당첨 로또 번호 출력
        int [] realLotto = new int[6];
        System.out.println("\n[로또 발표]");
        realLotto = lottoRandom();
        System.out.println(Arrays.toString(realLotto));

        //내로또 번호 출력하고 몇개 일치한지 출력
        System.out.println("\n[내 로또 결과]");

        int[] count = new int[lottNum];  // 몇개 일치하는지 알려주는 배열

        for (int i = 0; i <lottNum; i++){
            int cnt = 0;
            for (int j = 0; j<6; j++){
                for (int k = 0; k<6; k++){
                    if (myLotto[i][j]==realLotto[k]) {
                        cnt++;
                    }
                }
                count[i] = cnt;
            }
        }

        for (int i = 0; i<lottNum; i++){
            System.out.print((char)('A'+i)+"\t");
            System.out.println(Arrays.toString(myLotto[i])+" ==> "+count[i]+"개 일치");
        }


    }
}
