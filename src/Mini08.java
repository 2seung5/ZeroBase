//이승호
import java.util.Scanner;

public class Mini08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long yearSalary;
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요. : ");
        yearSalary = sc.nextInt();
        long tax = 0;
        int cnt;
        long[] taxArr = {12000000L, 34000000L,42000000L, 62000000L, 150000000L, 200000000L, 500000000L};
        int[] taxPercent = {6,15,24,35,38,40,42,45};
        if (yearSalary / 1000000000L >= 1) {
            cnt = 8;
        } else if (yearSalary / 500000000L >= 1) {
            cnt = 7;
        } else if (yearSalary / 300000000L >= 1) {
            cnt = 6;
        } else if (yearSalary / 150000000L >= 1) {
            cnt = 5;
        } else if (yearSalary / 88000000L >= 1) {
            cnt = 4;
        } else if (yearSalary / 46000000L >= 1) {
            cnt = 3;
        } else if (yearSalary / 12000000L >= 1) {
            cnt = 2;
        } else {
            cnt = 1;
        }

        while(yearSalary!=0){
            for (int i = 0; i< cnt-1; i++) {
                System.out.printf("%12d * %2d = %15d\n", taxArr[i],taxPercent[i], taxArr[i]*taxPercent[i]/100);
                yearSalary -= taxArr[i];
                tax += taxArr[i]*taxPercent[i]/100;
            }
            System.out.printf("%12d * %2d = %15d\n", yearSalary,taxPercent[cnt-1], yearSalary*taxPercent[cnt-1]/100);
            tax += yearSalary*taxPercent[cnt-1]/100;
            yearSalary =0;
        }
        System.out.println();

        System.out.printf("[세율에 의한 세금]: %20d\n",tax);
        System.out.printf("[누진공세 계산에 의한 세금]:%13d\n",tax);
/*        if (yearSalary%1000000000L>0){
            yearSalary -= 1000000000L;
            System.out.println("12000000 * 6% =\t\t 720000");
            System.out.println("34000000 *15% =\t\t 5100000");
            System.out.println("42000000 *24% =\t\t 100080000");
            System.out.println("62000000 *35% =\t\t"+42000000L*35/100);
            System.out.println("150000000 *38% =\t\t "+150000000L*38/100);
            System.out.println("200000000 *40% =\t\t "+200000000L*40/100);
            System.out.println("500000000 *42% =\t\t "+500000000L*42/100);
            System.out.println(yearSalary+" * 45 = \t\t"+yearSalary*45/100);
        }
        if (yearSalary%12000000L<0){
            System.out.println(yearSalary+" *6% = \t\t"+yearSalary*6/100);
            tax = yearSalary*6/100;
        }
        else if (yearSalary % 12000000L > 0 && yearSalary % 460000000 < 1) {
            yearSalary -= 12000000L;
            System.out.println("12000000 * 6% =\t\t 720000");
            System.out.println(yearSalary + " *15% =\t" + yearSalary * 15 / 100);
            tax = yearSalary*15/100;
        }
        else if (yearSalary % 46000000L > 0 && yearSalary % 88000000L < 1) {

        }*/

    }
}
