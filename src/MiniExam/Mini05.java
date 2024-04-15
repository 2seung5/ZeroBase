package MiniExam;//이승호
import java.util.Calendar;
import java.util.Scanner;


interface Calendars{
    public abstract void setCalendar(int year, int month);
}
class Calendar2 implements Calendars {
    int arr[][] = new int[6][7];
    public void setCalendar(int year, int month) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);

        //System.out.println("[" + year + "년" + month + "월" + "]");
        //System.out.print("일\t월\t화\t수\t목\t금\t토");



        int currentDay = 1;
        int count = 1;
        for (int i = 0; i<6;i++){
            for (int j =0; j<7; j++){
                if (count < startDay) {
                    arr[i][j] = -1;//출력할때 -1이면 공백 출력해주기
                    count++;
                }
                else if (currentDay>lastDay)
                    arr[i][j] = -1;
                else {
                    arr[i][j] = currentDay;
                    currentDay++;
                }
            }
        }

        /*for (int i = 0; i < 35; i++) {
            if (i < startDay)
                System.out.print("\t");
            else {
                System.out.printf("%02d\t", currentDay);
                currentDay++;
            }
            if (i % 7 == 0)
                System.out.println();

            if (currentDay > lastDay)
                break;
        }
        System.out.println();*/

    }


}

public class Mini05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year;
        int month;
        System.out.print("달력의 년도를 입력해 주세요.(yyyy): ");
        year = sc.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm): ");
        month = sc.nextInt();

        //13월 0월 처리
        if(month==1) {
            System.out.print("[" + (year-1) + "년" + "12" + "월" + "]" + "\t\t\t\t\t\t");
            for (int i = 0; i < 2; i++) {
                System.out.print("[" + year + "년" + (month + i) + "월" + "]" + "\t\t\t\t\t\t");
            }
        }
        else if (month ==12){
            for (int i = -1; i < 1; i++) {
                System.out.print("[" + year + "년" + (month + i) + "월" + "]" + "\t\t\t\t\t\t");
            }
            System.out.print("[" + (year+1) + "년" + "1" + "월" + "]" + "\t\t\t\t\t\t");
        }
        else {
            for (int i = -1; i < 2; i++) {
                System.out.print("[" + year + "년" + (month + i) + "월" + "]" + "\t\t\t\t\t\t");
            }
        }
        System.out.println();

        for (int i = 0; i<3; i++) {
            System.out.print("일\t월\t화\t수\t목\t금\t토\t\t");
        }
        System.out.println();

        Calendar2[] calendar2  = new Calendar2[3];
        for (int i =0; i< 3; i++){
            calendar2[i] = new Calendar2();
            calendar2[i].setCalendar(year,month-1+i);
        }
        for (int j = 0; j<6; j++){
            for (int i = 0; i<3; i++){
                for (int k = 0; k<7; k++) {
                   if (calendar2[i].arr[j][k] == -1) {
                        System.out.print("\t");
                        continue;
                    }
                    System.out.printf("%02d",calendar2[i].arr[j][k]);
                    System.out.print("\t");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
