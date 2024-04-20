package Algorithm.Heap;

import java.util.*;

class MinHeap{
    ArrayList<Integer> heap;

    public MinHeap(){
        this.heap = new ArrayList<>();
        this.heap.add(0); //arraylist 첫번째는 더미데이터 넣는다. 인덱스 1부터 시작하기위해
    }

    public void insert(int data){
        heap.add(data); //일단 가장 마지막에 넣어줌
        int cur = heap.size() -1; //넣은 데이터의 인덱스 얻기
        while (cur > 1&& heap.get(cur/2) > heap.get(cur)){  //부모노드의 값보다 작으면 교체
            int parentVal = heap.get(cur/2);
            heap.set(cur/2, data);
            heap.set(cur, parentVal);

            cur/=2;
        }
    }

    public Integer delete(){  //가장 상위노드값 삭제 후 힙 다시 정렬
        if (heap.size()==1){
            System.out.println("힙 비어있음");
            return null;
        }
        int target = heap.get(1);
        heap.set(1, heap.get(heap.size()-1));  //root에 가장 마지막 위치 값 넣어줌
        heap.remove(heap.size()-1);
        
        //정렬
        int cur = 1;
        while (true){
            int leftIdx = cur *2;
            int rightIdx = cur*2+1;
            int targetIdx = -1;
            
            if (rightIdx < heap.size()){  //오른쪽 자식노드까지 결국 두 자식노드가 있는경우
                targetIdx = heap.get(leftIdx) < heap.get(rightIdx) ? leftIdx : rightIdx;
            } else if (leftIdx < heap.size()) { //자식노드가 왼쪽 하나일경우
                targetIdx = cur *2;
            }else { //자식노드가 없는경우
                break;
            }
            if (heap.get(cur) < heap.get(targetIdx)){
                break;
            }else {
                int parentVal = heap.get(cur);
                heap.set(cur, heap.get(targetIdx));
                heap.set(targetIdx, parentVal);
                cur = targetIdx;
            }
        }

        return target;
    }

    public void printTree(){
        for (int i = 1; i< this.heap.size(); i++ ){
            System.out.println(this.heap.get(i) + " ");
        }
    }
}
public class HeapStudy {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(10);
        minHeap.printTree();
        minHeap.insert(50);

        //삭제
        System.out.println("삭제"+ minHeap.delete());
        minHeap.printTree();
    }
}
