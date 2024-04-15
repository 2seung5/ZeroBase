package Stack;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon25556 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        int check = 0;
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        Stack stack4 = new Stack();

        for (int i =0; i< arr.length; i++){
            if(stack1.empty() || arr[i] > (int)stack1.peek()){
                stack1.push(arr[i]);
            }
            else if(stack2.empty() || arr[i] > (int)stack2.peek()){
                stack2.push(arr[i]);
            }
            else if(stack3.empty() || arr[i] > (int)stack3.peek()){
                stack3.push(arr[i]);
            }
            else if (stack4.empty() || arr[i] > (int)stack4.peek()){
                stack4.push(arr[i]);
            }
            else {
                check = -1;
            }
        }
        if (check == -1){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }


    }
}
