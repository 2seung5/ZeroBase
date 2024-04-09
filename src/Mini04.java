import java.util.Random;
import java.util.Scanner;

public class Mini04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String year;
        String month;
        String day;
        char gender;
        String genderNum = null;
        String resiterNum;
        int randomNum;

        System.out.print("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy): ");
        year = sc.next();
        System.out.print("출생월을 입력해 주세요.(mm): ");
        month = sc.next();
        System.out.print("출생일을 입력해 주세요.(dd): ");
        day = sc.next();
        System.out.print("성별을 입력해 주세요.(m/f): ");
        gender = sc.next().charAt(0);

        if(gender == 'm')
            genderNum = "3";
        else if (gender == 'f') {
            genderNum = "4";
        }
        else System.out.println("잘못입력하셨습니다.");
        //출생년도 앞 두자리 자르기
        String year2;
        year2 = year.substring(2,4);

        //임의번호 생성
        Random random = new Random();
        randomNum = random.nextInt(999999)+1;

        resiterNum = year2+month+day+"-"+genderNum+randomNum;
        System.out.println(resiterNum);

    }
}
