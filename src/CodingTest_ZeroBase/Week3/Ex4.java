package CodingTest_ZeroBase.Week3;

public class Ex4 {
    static int answer = 0;
    public static int solution(int x1, int y1, int x2, int y2){

        if (x1==x2 && y1 ==y2)
            return 0;
        if (Math.abs(x1-x2)+Math.abs(y1-y2)<=3){
            answer++;
            return answer;
        }
        int distX = x1-x2;
        int distY = y1-y2;

        if (Math.abs(distX)>=Math.abs(distY)){
            if (distX>=0){
                x1 -=1;
                x2 +=1;
                if (distY > 0){
                    y2 +=1;
                }else {
                    y2 -=1;
                }
            }else {
                x1 += 1;
                x2 -= 1;
                if (distY > 0){
                    y2 +=1;
                }else {
                    y2 -=1;
                }
            }
        }else {
            if (distY>=0){
                y1 -=1;
                y2 +=1;
                if (distX>0){
                    x2 +=1;
                }else {
                    x2 -=1;
                }

            }else {
                y1 += 1;
                y2 -= 1;
                if (distX>0){
                    x2 +=1;
                }else {
                    x2 -=1;
                }
            }
        }
        answer++;

        solution(x1,y1,x2,y2);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(0,0,0,0));
    }
}
