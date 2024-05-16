package CodingTest_ZeroBase.Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        int[] a = {5,2,1,4,6};
        int[] b = {6,1,0,4,4};

        ArrayList<Integer> list = new ArrayList<>();
        int[] temp = new int[a.length>b.length? a.length : b.length];
        int tmp=0;
        if (a.length>=b.length && b.length!=0){
            for (int i = a.length-b.length; i<temp.length; i++){
                temp[i] = b[tmp++];
            }
        } else if (b.length>a.length && a.length!=0) {
            for (int i = b.length-a.length; i<temp.length; i++){
                temp[i] = a[tmp++];
            }
        }

        int sum = 0;
        if (a.length>= b.length){
            for (int i = a.length-1; i>=0; i--){
                sum += a[i] + temp[i];
                list.add(0, sum%10);
                sum /= 10;
            }
        } else {
            for (int i = b.length - 1; i >= 0; i--) {
                sum += b[i] + temp[i];
                list.add(0, sum % 10);
                sum /= 10;
            }
        }

        if (sum!=0) {
            list.add(0, sum);
        }
        System.out.println(list);

    }
}
