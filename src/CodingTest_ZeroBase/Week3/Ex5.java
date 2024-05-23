package CodingTest_ZeroBase.Week3;

public class Ex5 {
    public static void main(String[] args) {
        int[] reward = {29,40,99,0,5,5};
        int[] health = {50,60,100,100,100,100};
        int[] optional = {1,1,1,0,0,0};
        int answer = 0;


        int attack = 1;
        for (int i = 0; i < optional.length-1; i++){
            /*System.out.println((int)Math.ceil((double) health[i]/attack)+(int)Math.ceil((double) health[i+1]/(attack+reward[i])));
            System.out.println((int)Math.ceil((double) health[i+1]/attack));*/
            if (optional[i]==0){
                answer += (int)Math.ceil((double) health[i]/attack);
                System.out.println(answer+"aa"+i);
                attack += reward[i];
            }else if ( (int)Math.ceil((double) health[i]/attack)+(int)Math.ceil((double) health[i+1]/(attack+reward[i])) <= (int)Math.ceil((double) health[i+1]/attack)){
                answer += (int)Math.ceil((double) health[i]/attack);
                System.out.println(answer+"bb"+i);
                attack += reward[i];
            }else {
                System.out.println(answer+"cc"+i);
                continue;
            }
        }
        if (optional[optional.length-1]==0){
            answer+= (int)Math.ceil((double) health[health.length-1]/attack);
        }

        System.out.println(answer);
    }
}
