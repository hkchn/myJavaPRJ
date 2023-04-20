import java.util.*;

public class git04_20 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        List <Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = null;

        for (int i = 0; i < 3; i++) {
            System.out.print("name : ");
            String name = scanner.next();

            System.out.print("number : ");
            String number = scanner.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("number", number);

            list.add(map);

            map = null;
        }
        int listSize = list.size();

        System.out.println("저장된 학생 수 : " + listSize);

        for (Map<String, String> rMap : list) {
            System.out.println("name : "+ rMap.get("name"));
            System.out.println("학번 : " + rMap.get("number"));
        }
    }
}
