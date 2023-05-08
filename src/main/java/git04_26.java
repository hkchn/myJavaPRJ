import java.util.Scanner;

public class git04_26 {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        int [] n = new int[5];
        int hap = 0;

        for(int i=0; i<n.length; i++){
            n[i] = s.nextInt();
            hap += n[i];
        }

        int max = n[0];
        int min = n[0];

        for (int i=1; i<n.length; i++){
            if(n[i] > max){
                max = n[i];
            } else if (n[i] < min) {
                min = n[i];
            }
        }
        double averrage = (double)hap/n.length;

        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);
        System.out.println("평균값 :" + averrage);

    }
}
