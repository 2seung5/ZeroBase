package Algorithm.Queue;


import java.util.ArrayList;
import java.util.Scanner;

public class BackJonn1021 {
    public static void main(String[] args) {
        int size;
        int num;
        int left=0;
        int right=0;

        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        num = sc.nextInt();
        int[] target = new int[num];
        for (int i = 0; i< num; i++){
            target[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i< size; i++){
            list.add(i+1);

        }

        for (int i = 0; i< target.length; i++){
            for (int j = 0; j<list.size(); j++) {
                if (list.get(0) == target[i]) {
                    list.remove(0);
                    break;

                } else if (list.indexOf(target[i]) > list.size()/2) {
                    int tmp = list.remove(list.size()-1);
                    list.add(0, tmp);
                    right++;
                }else if(list.indexOf(target[i]) <= list.size()/2){
                    int tmp = list.remove(0);
                    list.add(tmp);
                    left++;
                }
            }


        }

        int result = right+left;
        System.out.println(result);

    }
}
