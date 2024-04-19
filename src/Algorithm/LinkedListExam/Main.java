package Algorithm.LinkedListExam;

//단순 연결 리스트 기본 구조 구현
class Node{
    int data;
    Node next; //자기자신의 클래스를 가리킬 노드 자료형으로 다음 노드 가리킬 변수

    Node(){}
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

class LinkedList{
    Node head;

    LinkedList(){}
    LinkedList(Node node){
        this.head = node;
    }
    //연결리스트 비어있는지
    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }

    //연결리스트의 맨 뒤에 데이터 추가
    public void addData(int data){
        if(this.head == null){
            new Node(data, null);
        }
        else{ //노드끝까지 순회하고 추가하는 코드
            Node cur = this.head;
            while (cur.next!=null){
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }
    //연결리스트 맨 뒤 데이터 삭제
    public void removeData(){
        if(this.isEmpty()){
            System.out.println("삭제할 데이터 없음");
            return;
        }
        Node cur = this.head;
        Node prev = cur;  //cur 보다 하나 덜 순회하는 노드
        while (cur.next!=null){
            prev = cur;
            cur = cur.next;
        }
        if (cur == this.head){ //데이터가 하나일경우 즉 헤드만 있었을 경우
            this.head = null;
        }
        else {
            prev.next = null;
        }
    }

    //연결리스트에서 데이터 찾기
    public void findData(int data){
        if(this.isEmpty()){
            System.out.println("리스트 비어있음");
            return;
        }

        Node cur = this.head;
        while (cur != null){
            if (cur.data == data){
                System.out.println("data 존재한다");
                return;
            }
            cur = cur.next;
        }
        System.out.println("찾는 데이터 없다");
    }

    //연결리스트의 모든 데이터 출력
    public void showData(){
        if (this.isEmpty()){
            System.out.println("리스트 비어있음");
            return;
        }
        Node cur = this.head;
        while (cur != null){
            System.out.println(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
public class Main {
}

