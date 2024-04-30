package CodingTestExam.Week2;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        String op;
        op = sc.next();
        int result = n;
        while (!op.equals("=")){
            n = sc.nextInt();
            if (op.equals("+"))
                result += n;
            else if (op.equals("-")) {
                result-=n;
            } else if (op.equals("*")) {
                result*=n;
            } else if (op.equals("/")) {
                result/=n;
            }
            op = sc.next();


        }
        System.out.println(result);
    }
}
