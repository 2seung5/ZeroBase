package CodingTestExam.Week2;

public class Test4_5 {
    public static void main(String[] args) {
        String[] array = {"n","nav","nev"};
        String s = "na asdf";

        int answer = 0;
        /*if(s.contains(" ")){
            int index = s.indexOf(" ");
            s = s.substring(0,index);
        }

        for (int i = 0; i< array.length; i++){
            if (s.contains(array[i])){
                answer++;
            }
        }*/

        for (int i = 0; i< array.length; i++){
            if (s.length()>=array[i].length()) {
                String result = "";
                result = array[i] + s.substring(array[i].length());
                if (result.equals(s)){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
