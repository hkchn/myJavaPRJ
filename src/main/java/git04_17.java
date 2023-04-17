import java.util.Scanner;
public class git04_17 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        int [] score = new int[5];
        int hap = 0;

        System.out.println("각 다른 숫자를 5번 입력해주세요");
        for (int i=0 ; i<score.length ; i++){
            score[i]= s.nextInt();
            hap += score[i];
        }

        int max = score [0];
        int min = score [0];

        for( int i=1 ; i<score.length ; i++){
            if(score[i]>max){
                max =score[i];
            } else if (score[i]<min) {
                min = score[i];
            }
        }
        double averrage = (double)hap/score.length;

        System.out.printf("최대값 : %d \n", max);
        System.out.printf("최소값 : %d \n", min);
        System.out.println("평균값 : "+ averrage);
    }
}
