import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class CHP3_7 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");//add메서드 사용
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches);
        System.out.println(pitches.get(0));//get메서드 사용 -> 인덱스 해당 값 리턴
        System.out.println(pitches.size());//size메서드 사용 -> 요쇼 개수 리턴
        System.out.println(pitches.contains("138"));//contain메서드 사용 -> boolean값 리턴
        System.out.println(pitches.contains("111"));
        //remove 메서드 사용 -> 사용법 2가지
        //remove객체 -> 객체 그대로 제거한다하면 제거 후 boolean값 리턴
        //remove인덱스 -> 인덱스로 제거한다면 제거 후 해당 요소 값 리턴
        System.out.println(pitches.remove("138"));
        System.out.println(pitches.remove(0));

        //제네릭스(그냥 일반적인 방식으로만 연습함)
        ArrayList<String> pitches2 = new ArrayList<>();
        pitches2.add("138");
        pitches2.add("129");

        String one = pitches2.get(0);
        String two = pitches2.get(1);
        System.out.printf("%s %s\n",one, two);

        //ArrayList만드는 방법
        String[] data = {"129", "128","142"};//이미 만들어진 문자열 배열을
        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList(data));
        //리스트로 만들어줌
        System.out.println(pitches3);

        ArrayList<Integer> pitches4 = new ArrayList<>(Arrays.asList(138,142,122));
        System.out.println(pitches4);//Stirng 자료형을 직접 작성한다.

        //String.join메서드
        //선언된 ArrayList값들 사이에 구분자를 끼어 넣어 하나의 문자열로 만들어주는 메서드
        ArrayList<String> pitches5 = new ArrayList<>(Arrays.asList("142","148","139"));
        String result = String.join(",", pitches5);
        System.out.println(result);

        ArrayList<String> pitches6 = new ArrayList<>(Arrays.asList("139","142","192"));
        pitches6.sort(Comparator.naturalOrder());
        System.out.println(pitches6);


    }
}
