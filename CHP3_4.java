import java.lang.reflect.Array;
import java.util.Arrays;

public class CHP3_4 {
    public static void main(String[] args) {
        //문자열 : 문자로 구성된 문장을 뜻한다.
        //문자열을 나타내는 자료형은 String이다.
        String a ="Happy Java";//문자열의 앞과 뒤는 쌍따옴표("")로 감싸야 한다.
        String b ="a";
        String c = "123";
        //new키워드는 객체를 만들때 사용 하지만 문자열을 표현할땐 가급적
        //첫번째 방식인 리터럴표기방식을 선택하는 것이 좋다.-->컴파일에 도움을 주고 가독성을 높임.
        String a1 = new String("Happy Java");
        String b1 = new String("a");
        String c1 = new String("123");

        //원시 자료형
        //long int double float boolean char형 모두 원시자료형이다.
        //이러한 원시자료형은 new키워드로 값을 생성할 수 없다.(리터럴 방식만 가능)

        //String 자료형은 리터럴 표기 방식도 가능하지만, 원시자료형은 아니다.
        //리터럴 표기 방시을 사용할 수 있도록 특별대우 자료형이다.

        //원시자료형들은 각각에 대응하는 Wrapper클래스가 있다. 멀티쓰레드 환경에서 동기화를 지원하려면 원시 자료형 대신 Wrapper클래스를 사용해야 한다.

        String a2 = "hello";
        String b2 = new String("hello");
        System.out.println(a2.equals(b2));
        System.out.println(a2==b2);

        String a4 = "Hello Java";
        System.out.println(a4.indexOf("Java"));

        System.out.println(a4.contains("Java"));

        System.out.println(a4.charAt(6));

        System.out.println(a4.replaceAll("Java", "world"));

        System.out.println(a4.substring(0,4));

        System.out.println(a4.toUpperCase());

        String a5 = "a:b:c:d";
        String[] result = a5.split(":");
        System.out.println(result);//이렇게 출력하게 되면 배열의 메모리 주소를 출력하게 됨.
        //그래서 배열의 내용 대신 result 배열의 해시코드 같은 형태가 출력됨.
        //배열을 출력하려면 Array.toString()메서드를 사용해야함.
        System.out.println(Arrays.toString(result));

        System.out.println(String.format("I ate %d apple", 3));

        System.out.println(String.format("I ate %s apples", "five"));

        int number = 10;
        String day = "three";

        System.out.println(String.format("I ate %d apples. so i was sick for %s days", number, day));

        System.out.printf("I ate %d apples", number);

    }
}
