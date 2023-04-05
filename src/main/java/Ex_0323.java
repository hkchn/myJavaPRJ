import java.util.Scanner;
public class Ex_0323 {

    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);

        System.out.printf("숫자를 입력하세요. => ");
        a = s.nextInt();

        System.out.printf("입력값 : %d \n", a);
        System.out.printf("출력 결과 \n");

        if (a % 3 == 0) {
            if (a % 5 == 0)
                System.out.printf("3과 5의 배수입니다. \n");
            else {
                    System.out.printf(" 3의 배수입니다 \n");
            }
        }
            if (a%5 == 0) {
                System.out.printf("5의 배수 입니다. \n");
            } else {
                System.out.printf("3과 5의 배수가 아닙니다. \n");
            }
    }
}