package Stack;
//arraylist를 이용해 스택처럼 구현
import java.util.ArrayList;
class ListStack{
    ArrayList list;

    ListStack(){
        this.list = new ArrayList();
    }
    public boolean isEmpty(){
        if(this.list.size()==0){
            return true;
        }else {
            return false;
        }
    }

    public void push(int data){
        this.list.add(data);
    }
    public Integer pop(){
        if(this.isEmpty()){
            System.out.println("스택 비어있음");
            return null;
        }
        int data = (int)this.list.get(this.list.size()-1);//data 가져오고 반환
        this.list.remove(this.list.size()-1);  //가져오고 삭제
        return data;
    }
    public Integer peek(){
        if(this.isEmpty()){
            System.out.println("스택 비어있음");
            return null;
        }
        int data = (int)this.list.get(this.list.size()-1);//data 가져오고 반환
        return data;
    }
    public void printStack(){
        System.out.println(this.list);
    }
}
public class ArrayListStack {
    public static void main(String[] args) {
        ListStack listStack = new ListStack();
        System.out.println(listStack.isEmpty());
        listStack.push(1);
        listStack.push(2);
        listStack.push(3);
        listStack.push(4);
        listStack.push(5);
        listStack.push(6);
        listStack.printStack();

        System.out.println(listStack.peek()
        );
    }
}
