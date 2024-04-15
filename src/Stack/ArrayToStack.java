package Stack;
//배열을 이용해 스택처럼 구현
class ArrayStack {
    int[] arr;
    int top=-1;
    ArrayStack(int size){
        arr = new int[size];
    }

    //비어있는지 top 값으로 확인해서 -1일때 비어있다고 해줌
    public boolean isEmpty(){
        if(this.top == -1){
            return  true;
        }
        else {
            return false;
        }
    }

    //배열이라 배열크기가고정되어있어 꽉차있으면 더이상 못넣게 해줘야함
    public boolean isFull(){
        if(this.top == this.arr.length-1){
            return true;
        }else {
            return false;
        }
    }

    public void push(int data){
        if(this.isFull()){
            System.out.println("스택 꽉차 있음");
            return;
        }
        this.top +=1;
        this.arr[this.top] = top;
    }

    //데이터는 남아있지만 top을 하나 줄여주어 있던 데이터는 접근 못하고 추가시 바꿔짐
    public Integer pop(){
        if(this.isEmpty()){
            System.out.println("스택 비어있음");
            return null;
        }
        int data = this.arr[this.top];
        this.top-= 1;
        return data;
    }

    public Integer peek(){
        if(this.isEmpty()){
            System.out.println("스택 비어있음");
            return null;
        }
        return this.arr[this.top];
    }
    public void printStack(){
        for (int i = 0; i< this.top+1; i++){
            System.out.println(this.arr[i]+ " ");
        }
    }
}
public class ArrayToStack {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        System.out.println(arrayStack.isEmpty());
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.printStack();

        System.out.println(arrayStack.peek());
        arrayStack.printStack();

        System.out.println(arrayStack.pop());
        arrayStack.printStack();
    }
}
