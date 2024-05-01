package CodingTestExam.Week2;

public class Test2_4 {
    public static void main(String[] args) {
        int A = 29;
        int B = 15;
        int answer = 0;

        String Abinary = String.format("%07d",Integer.parseInt(Integer.toBinaryString(A)));
        String Bbinary = String.format("%07d",Integer.parseInt(Integer.toBinaryString(B)));
        String[] arr1 = Abinary.split("");
        String[] arr2 = Bbinary.split("");
        for (int i = 0; i<arr1.length;i++){
            if (!arr1[i].equals(arr2[i]))answer++;
        }

        System.out.println(answer);
    }
}
