package Queue;
import java.util.ArrayList;
class ListQueue1{
    ArrayList list;
    ListQueue1(){
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data){
        this.list.add(data);
    }

    public Integer poll(){
        if(this.isEmpty()){
            System.out.println("큐 비어있음");
            return null;
        }
        int data = (int)this.list.get(0);
        this.list.remove(0);
        return data;
    }
    public Integer peek(){
        if(this.isEmpty()){
            System.out.println("큐 비어있음");
            return null;
        }
        return (int)this.list.get(0);
    }
    public void printQueue(){
        System.out.println(this.list);
    }


}
public class ListQueue {



}
