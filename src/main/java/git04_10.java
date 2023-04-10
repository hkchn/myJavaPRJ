import java.util.Scanner;

public class git04_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 다이아몬드의 크기를 적어주세요. :");
        int num = sc.nextInt();


        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = num - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

