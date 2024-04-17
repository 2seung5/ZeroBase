package Algorithm.Sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){
        if (left>=right){
            return;
        }
        int pivot = partition(arr, left, right);

        quickSort(arr, left, pivot-1);
        quickSort(arr,pivot+1, right);
        //pivot자리는 정렬되어있으니 뺌

    }
    public static int partition(int[] arr, int left, int right){
        int pivot = arr[left]; //가장좌측값을 피봇으로
        int i = left;
        int j = right;

        //i랑 j가 만날때까지 반복 i가 j보다 즉 left가 right보다 커질때 탈출
        while (i < j){
            while (arr[j] > pivot && i<j){
                j--;
            }
            while (arr[i] <= pivot && i<j){
                i++;
            }
            swap(arr, i, j);
        }

        swap(arr, left, i); //만나는지점에 피봇값 넣기

        return i;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr ={3,5,2,7,1,4,6};
        quickSort(arr,0,arr.length-1);
        System.out.println("퀵정렬 : "+ Arrays.toString(arr));
    }
}
