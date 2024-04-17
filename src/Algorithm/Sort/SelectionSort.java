package Algorithm.Sort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        //최소값 찾아서 앞쪽의 데이터와 비교
        for (int i = 0; i< arr.length-1; i++){
            int min = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }

        //최댓값 찾아서 뒤쪽의 데이터와 비교
        for (int i = arr.length-1; i> 0; i--){
            int max = i;
            for (int j = i-1; j>=0; j--){
                if (arr[j] > arr[max]){
                    max = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[max];
            arr[max] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,4,6,7,9};
        selectionSort(arr);
        System.out.println("선택정렬 : " + Arrays.toString(arr));
    }
}
