package Algorithm.Sort;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] arr){
        for (int i = arr.length/2-1; i>=0; i--){
            heapify(arr, i , arr.length);
        }
        for (int i = arr.length-1; i>0; i--){
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    //기존 배열을 힙으로 바꿔줌 맥스힙 자료구조
    public static void heapify(int[] arr, int parentIdx, int size){
        int leftIdx = 2*parentIdx +1;
        int rightIdx = 2 * parentIdx +2;
        int maxIdx = parentIdx; //맥스랑 자식노드랑 비교해서 더 큰수를 앞쪽으로 땡김

        if (leftIdx < size && arr[maxIdx] < arr[leftIdx]){
            maxIdx = leftIdx;
        }
        if (rightIdx < size && arr[maxIdx] < arr[rightIdx]){
            maxIdx = rightIdx;
        }

        //기존의 maxIdx였던 parentIdx가 교체가 되었을 때 위 두 if문에 의해
        if(parentIdx != maxIdx){
            swap(arr, maxIdx, parentIdx);
            heapify(arr, maxIdx, size);  //추가적으로 자리교체 필요할수있어서
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr ={3,5,2,7,1,4,6};
        heapSort(arr);
        System.out.println("힙정렬 : "+ Arrays.toString(arr));
    }
}
