import java.util.Scanner;
import java.util.Stack;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t<=T; t++){
            Stack<String> stack = new Stack<>();
            int answer = 0;
            int N;
            String s;
            N = sc.nextInt();
            s = sc.next();
            if (N!=s.length() || N < 3 || N > 100){
                System.out.println("문자열의 길이가 맞지 않습니다");
                t--;
                continue;
            }
            String[] arr = s.split("");
            for (int i = 0; i < arr.length; i++){
                if (stack.isEmpty()){
                    stack.push(arr[i]);
                }
                else if ((stack.peek().equals("a")||stack.peek().equals("b"))&& (arr[i].equals("a")||arr[i].equals("b"))){
                    answer++;
                    continue;
                }else{
                    stack.push(arr[i]);
                }

            }
            System.out.println(stack);
            System.out.println("#"+t+" "+answer);
        }
        sc.close();
    }
}
