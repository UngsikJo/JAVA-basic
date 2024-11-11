import java.util.HashMap;
import java.util.ArrayList;

public class CHP3_8 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //HashMap자료형 또한 제네릭스를 사용한다.
        //Key와 value값 모두 String자료형으로 사용해야 하며 그 이외에 자료형들은 사용 불가능
        map.put("people", "사람");//put 메서드 사용
        map.put("baseball","야구");
        System.out.println(map.get("people"));//get메서드 사용
        System.out.println(map.getOrDefault("java","자바"));//getOrDefault메서드 사용
        System.out.println(map.containsKey("people"));//contains메서드 사용
        System.out.println(map.remove("people"));//remove 메서드: 맵의 항목을 삭제후 키에 대응 되는 값을 리턴한다.
        System.out.println(map.size());//size메서드 맵의 요소의 개수를 반환
        map.put("people","사람");
        map.put("nice","나이스");
        System.out.println(map.keySet());//keySet메서드 맵의 키들을 모아서 리턴한다
        //-> people, baseball, nice 출력

        //keySet은 맵의 키를 모아 집합 자료형으로 만든다. 집합자료형은 리스트 자료형으로 바꾸어 사용가능하다.
        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);//집합 자료형을 출력

    }
}
