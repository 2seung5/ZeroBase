package CodingTestExam.Week2;

public class Test5_1 {
    public static void main(String[] args) {
        String sentence = "a ";
        String word = "";
        int answer = -1;

        String[] s = sentence.split(" ");
        for (int i = 0; i< s.length; i++){
            if(s[i].equals(word)){
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
