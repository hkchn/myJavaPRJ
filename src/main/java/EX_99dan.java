public class EX_99dan {
    public static void main(String [] args){

        int a, b;

        for (b= 1; b <= 9; b++){

            for (a=2; a <= 9; a++){
                System.out.printf(" %d x %d = %d", a, b, a*b);
            }
            System.out.printf("\n");
        }
    }
}