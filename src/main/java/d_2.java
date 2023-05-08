import java.util.Scanner;
public class d_2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int[] score = new int[5];
        int hap = 0;

        for (int i=0 ; i<score.length ; i++){
            score[i] = s.nextInt();
            hap += score[i];
        }

        int max = score[0];
        int min = score[0];

        for (int i= 1; i<score.length ; i++){
            if(score[i] > max){
            max = score[0];
            } else if (score[i] < min){
                min = score[i];
            }
        }
        double avg = (double)hap/score.length;

        System.out.println("최대값 :"+ max);
        System.out.println("최소값 :"+ min);
        System.out.println("평균값 :"+ avg);
    }
}
