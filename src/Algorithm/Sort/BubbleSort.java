package Algorithm.Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i = 1; i< arr.length-1; i++){
            for (int j = 0; j< arr.length-i;i++){
                if (arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        //2번째 방법
        /*for (int i = arr.length-1; i>0; i--){
            for (int j = 0; j<i; i++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }*/
    }
    public static void main(String[] args) {
        int[] arr = {3,1,4,6,7,9};
        bubbleSort(arr);
        System.out.println("버블정렬 : " + Arrays.toString(arr));
    }
}
