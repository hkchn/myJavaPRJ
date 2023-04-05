import java.util.Scanner;

public class git04_05 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a, b;                                                     // 변수 a, b를 만든다.

        System.out.println("원하는 단을 입력하시오. : ");                 // 원하는 단을 입력하시오. 를 출력한다.
        a = s.nextInt();                                              // a의 변수를 내가 입력한 수로 정한다.

        System.out.printf("%d 단\n" , a);                             // a단을 출력한다.
        for(b=2 ; b<10 ; b++){                                       // b를 2로 지정하고, b가 10 미만일 때, b를 1씩 더한다.
            System.out.printf("%d X %d = %d \n", a, b, a*b);         // a X b = a*b 을 출력한다
        }
        System.out.println("입력을 종료합니다.");                       // 입력을 종료합니다. 를 출력한다.
    }
}
