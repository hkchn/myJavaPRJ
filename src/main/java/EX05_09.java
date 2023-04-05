import java.util.Scanner;

public class EX05_09 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a;

        System.out.printf(" 1 ~ 4 중 선택하세요 : ");
        a = s.nextInt();

        switch (a) {
            case 1:
                System.out.println(" 1을 선택했다. \n");
            break;
            case 2:
                System.out.println(" 2를 선택했다. \n");
            break;
            case 3:
                System.out.println(" 3를 선택했다. \n");
            break;
            case 4:
                System.out.println(" 4를 선택했다. \n");
            break;
            default:
                System.out.println(" 이상한 걸 선택했다. \n");
        }
    }
}
