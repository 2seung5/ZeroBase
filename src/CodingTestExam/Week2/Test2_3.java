package CodingTestExam.Week2;

import java.util.Stack;

public class Test2_3 {
    static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        String S = "2-6-7*8/2+5";
        double answer = 0;

        String[] operand =S.split("\\D+");
        String[] operator =S.split("\\d+");
        System.out.println(operator[0]); //빈문자열



        Stack<String> stack = new Stack<>();
        stack.push(operand[0]);
        double tmp;
        double temp;
        for (int i = 1; i<operand.length; i++){
            if(operator[i].equals("*")){
                tmp = Double.parseDouble(stack.pop());
                temp = tmp*Double.parseDouble(operand[i]);
                System.out.println(temp+"asd");
                stack.push(Double.toString(temp));

            } else if (operator[i].equals("/")) {
                tmp = Double.parseDouble(stack.pop());
                temp = tmp/Double.parseDouble(operand[i]);
                System.out.println(temp);
                stack.push(Double.toString(temp));
            } else if (operator[i].equals("-")) {
                tmp = -Double.parseDouble(operand[i]);
                stack.push(Double.toString(tmp));
            }else if(operator[i].equals("+")){
                stack.push(operand[i]);
            }

        }
        System.out.println(stack);
        while (!stack.isEmpty()){
            answer += Double.parseDouble(stack.pop());

        }
        String result = String.format("%.2f",answer);


        System.out.println(result);
    }
}
