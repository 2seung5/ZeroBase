package Algorithm.Queue;
//원형 큐로 배열 관리
class ArrayQueue1{
    int [] arr;
    int front = 0;  //index관리
    int rear = 0;   //index관리

    ArrayQueue1(int size){
        arr = new int[size];  //원형큐를 위해서 size+1 처음 들어가는 값이 front값보다 하나 크게 해줘서
                              //배열 하나를 비어서 rear가 front가 같을 때 큐 비어있다고 판단
    }
    public boolean isEmpty(){
        return this.rear == this.front;
    }
    public boolean isFull(){
        return (this.rear + 1)%this.arr.length == this.front;
    }

    public void enqueue(int data){
        if (this.isFull()){
            System.out.println("큐 꽉차있음");
            return;
        }
        this.rear = (this.rear + 1)% this.arr.length;
        this.arr[this.rear] = data;
    }
    public Integer dequeue(){
        if (isEmpty()){
            System.out.println("큐가 비어있음");
            return null;
        }
        front = (front + 1)% this.arr.length;
        return this.arr[front];
    }

    //dequeue에서는 값을 삭제하는 것이 없어서 프린트 하는 함수에서 start와 end를 이용하여 조작해서 프린트

    public void printQueue(){
        int start = (this.front +1)% this.arr.length;
        int end = (this.rear +1) % this.arr.length;
        for (int i = start; i !=end; i = (i+1)%this.arr.length){
            System.out.println(this.arr[i]+ " ");
        }
        System.out.println();
    }
}
public class ArrayQueue {
}
