import java.util.*;
public class Qz_0503 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        List<Integer> list = new LinkedList<>();

        for (int i=0 ; i<5 ; i++){
            System.out.printf("%d번째 숫자를 입력하세요: ", i+1);
            int num = s.nextInt();
            list.add(num);
        }

        for(int i=0; i <list.size(); i++){
            for (int k= i+1; k<list.size();k++){
                if(list.get(i) == list.get(k)){
                    list.remove(k);
                    k--;
                }
            }
        }

        System.out.println("저장된 값은 " +list);
    }
}
