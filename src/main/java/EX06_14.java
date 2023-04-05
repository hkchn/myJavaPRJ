public class EX06_14 {
    public static void main(String [] args){

        int a, b;

        for (a= 2; a <= 9; a++){
            System.out.printf(" %d단 \n", a);
            for (b=1; b <= 9; b++){
                System.out.printf(" %d x %d = %d \n ", a, b, a*b);
            }
            System.out.printf("\n");
        }
    }
}
