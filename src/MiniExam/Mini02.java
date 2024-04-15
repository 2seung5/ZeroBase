package MiniExam;//이승호
import java.util.*;
public class Mini02 {
    public static void main(String[] args) {
        int price;
        int cash;

        Scanner sc = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액 입력해 주세요.(금액):");
        price = sc.nextInt();
        cash = price/10;
        cash -= cash%100;
        if(cash>300)
            cash =300;
        System.out.println("결제 금액은 "+price+"원이고, 캐시백은 "+cash+ "원입니다.");
    }
}
