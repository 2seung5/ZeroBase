import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

//이승호
public class Mini06 {


        public static void printVote(int voteNum, String[] name, int cnt){
            int[] result = new int[voteNum];
            HashMap<Integer, String> map = new HashMap<Integer,String>();          //이름과 기호번호 매핑 -> 투표한 기호로 이름 꺼내주기 위해
            for (int i = 1; i<= cnt; i++){
               map.put(i,name[i-1]);
            }
            //System.out.println(map.get(1));
            result = randomVote(voteNum, cnt);
            int[] count = new int[cnt]; // 투표받은 수 카운트 해주는 배열
            for (int i = 0; i<cnt; i++){
                count[i] = 0;
            }
            //System.out.println(result.length);

            for(int i = 0; i< result.length; i++) {
                System.out.printf("[투표진행률] : %.2f%%, %d 명 투표 => %s\n", (double)(i+1)/voteNum*100, i+1, map.get(result[i]));
                int tmp = result[i];
                count[tmp-1] +=1;
                for (int j = 0; j < cnt; j++){
                    System.out.printf("[기호:%d] %s:\t%.2f%%\t\t(투표수: %d)\n", j+1,name[j],(double)count[j]/voteNum*100, count[j]);
                }
                System.out.println();
            }

        }

        public static int[] randomVote(int voteNum, int cnt){
            int[] voteResult = new int[voteNum];
            Random random = new Random();
            for (int i = 0; i< voteNum; i++){
                voteResult[i] = random.nextInt(cnt)+1;             //voteResult ->투표 선택한 기호를 담는 배열
            }
            return voteResult;
        }


    public static void main(String[] args) {
        int voteNum;   //10~10000
        int cnt; //후보자 인원수
        String [] name = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("총 진행할 투표수를 입력해 주세요. : ");
        voteNum = sc.nextInt();
        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요. : ");  //2~10
        cnt = sc.nextInt();
        for (int i =1; i<=cnt; i++) {
            System.out.print(i + "번째 후보자이름을 입력해 주세요. : ");
            name[i-1] = sc.next();
        }
        printVote(voteNum, name, cnt);


    }
}
