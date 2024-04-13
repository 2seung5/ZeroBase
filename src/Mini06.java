import java.util.Scanner;

//이승호
public class Mini06 {
    class Vote{
        String [][] vote = new String[10][10];
        public void printVote(int voteNum, String[] name, int cnt){
            for (int i = 0; i<2; i++){
                for (int j = 0; j<cnt; j++){
                    vote[i][j] = "ㄱ딛ㄱㄷㄱ";
                }
            }
            for(int i = 0; i< voteNum; i++) {
                System.out.printf("[투표진행률] : %.2f, %d 명 투표 => %s", (double)i/voteNum, i, name);
            }
        }
    }

    public static void main(String[] args) {
        int voteNum;
        int cnt; //후보자 인원수
        String [] name = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("총 진행할 투표수를 입력해 주세요. : ");
        voteNum = sc.nextInt();
        System.out.println("가상 선거를 진행할 후보자 인원을 입력해 주세요. : ");
        cnt = sc.nextInt();
        for (int i =0; i<cnt; i++) {
            System.out.println(i + "번째 후보자이름을 입력해 주세요. : ");
            name[i] = sc.nextLine();
        }
    }
}
