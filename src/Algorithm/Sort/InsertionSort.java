package Algorithm.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i< arr.length; i++){
            for (int j = i; j>0; j--){
                if (arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =tmp;
                }else break; //앞에 정렬 되어있으니 안쪽 반복문 탈출 후연산 수 줄여주는
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,6,7,9};
        insertionSort(arr);
        System.out.println("삽입정렬 : " + Arrays.toString(arr));
    }
}
