import java.util.Scanner;
public class git04_19 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for ( int i=0; i< a.length ; i++){
            int num = sc.nextInt();
            a[i] = num;
        }

        for (int i = 0; i<a.length; i++){
            for(int j = i + 1; j< a.length; j++ ){
                int change;
                if(a[i] < a[j]){
                    change = a[i];
                    a[i] = a[j];
                    a[j] = change;
                }
            }
        }

        for ( int i = 0; i<a.length; i++)
            System.out.println(a[i] + " ");

    }
}
