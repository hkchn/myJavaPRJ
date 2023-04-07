import java.util.Scanner;
import java.io.IOException;

public class Calculator {
    public static void main(String [] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int a, b, result;
        char c;

        System.out.println("첫번째 수를 입력하세요. :");
        a = s.nextInt();

        System.out.println("연산자를 입력하세요. :");
        c = (char) System.in.read();

        System.out.println("두번째 수를 입력하세요. :");
        b = s.nextInt();

        switch(c){
            case '+' :
                result = a + b;
                System.out.printf("%d + %d = %d", a, b, result);
                break;
            case '-' :
                result = a - b;
                System.out.printf("%d - %d = %d", a, b, result);
                break;
            case '*' :
                result = a * b;
                System.out.printf("%d * %d = %d", a, b, result);
                break;
            case '/' :
                result = a / b;
                System.out.printf("%d 3 / %d = %d", a, b, result);
                break;
            default :
                System.out.println("잘못 입력하셨습니다.");

        }
    }
}
