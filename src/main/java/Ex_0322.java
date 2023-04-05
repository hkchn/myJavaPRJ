import java.util.Scanner;
public class Ex_0322 {

    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);

        System.out.printf("숫자를 입력하세요. => \n");
        a = s.nextInt();

        if (a % 3 == 0) {
            System.out.printf("3의 배수 입니다. \n");
        } else {
            System.out.printf("3의 배수가 아닙니다. \n");
        }
    }
}
