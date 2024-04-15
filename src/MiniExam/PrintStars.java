package MiniExam;

public class PrintStars {
    public static void main(String[] args) {
       for(int i = 0; i<5; i++){
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i< 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i<5; i++){
            for (int k = 5-i; k>0 ; k--){
                System.out.print(" ");
            }
            for (int j = 0 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i<5; i++){
            for (int j = 5-i; j>0; j--){
                System.out.print(" ");
            }
            for (int k = 0; k< 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <=5/2; i++){
            for (int j =0; j<5/2-i; j++){
                System.out.print(" ");
            }
            for (int k= 0; k<(2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5/2; i>0; i--){
            for (int j = 0; j<5/2+1-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //
    }
}
