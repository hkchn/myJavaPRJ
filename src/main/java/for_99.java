public class for_99 {
    public static void main(String [] args){

        int a, b;                                                   // 변수 a와 b를 만든다.

        for( a=2, b=1 ; a<10 ; b++) {        //변수 a를 2, b를 1로 지정하고, a가 10보다 작을 때, b에 1를 더해준다
            if(b>10){               // 만약 b가 10을 초과할 경우
                b=1;                     // 변수 b를 1로 지정한다.
                a++;                     // a에 1를 더해준다
            }
            if(a<10){               //만약 변수 a가 10 미만일 경우
                System.out.printf("%d X %d = %d", a, b, a*b);         //a X b = a*b를 출력한다.
            }
        }
    }
}