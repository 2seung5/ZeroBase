package CodingTestExam.Week2;

public class Exam2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        String direction = "left";
        int[] answer = new int[numbers.length];
        if (direction.equals("right")){
            for (int i = 0; i<numbers.length; i++){
                answer[(i+1)%numbers.length] = numbers[i];
            }
        }else {
            for (int i = 0; i<numbers.length; i++){
                answer[(i+numbers.length-1)%numbers.length] = numbers[i];
            }
        }
        for (int i = 0; i<answer.length; i++)
            System.out.println(answer[i]);
    }
}
