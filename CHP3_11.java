import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHP3_11 {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);//int의 Wrapper클래스인 Integer클래스 사용
        System.out.println(n);

        int n1 = 123;
        String num1 = "" + n1;
        System.out.println(num1); //가장 쉽게 정수를 문자열로 바꾸는 방법

        //<정수를 문자열로 바꾸는 메서드 2개>
        int n2= 123;
        String num2 = String.valueOf(n2);//String 자료형은 따로 Wrapper클래스가 없지만 제공되는 메서드를 사용
        String num3 = Integer.toString(n2);//Integer클래스 사용
        System.out.println(num2);
        System.out.println(num3);

        String num4 = "123.456";
        double d = Double.parseDouble(num4);//실수형태의 문자열을 실수로 변환하는 방법이다.
        System.out.println(d);
        //이외에도
        float f = Float.parseFloat(num4);
        System.out.println(f);//Float클래스도 사용가능하다.

        //<정수와 실수 사이의 형변환>
        int n3 = 123;
        double d1 = n3;//정수에서 실수로는 따로 캐스팅이 필요없다.
        System.out.println(d1);

        double d2 = 123.456;
        int n4 = (int)d2;//실수를 정수로 바꿀때는 반드시 캐스팅이 필요하다.
        System.out.println(n4);//소수점 아래로는 다 날아간다.

        //<실수형태의 문자열을 정수로 반환할 경우>
        String num5 = "123.456";
        double num6 = Double.parseDouble(num5);
        int n5 = (int)num6;//(실수형태문자열)->(실수형)->(정수형) 총3번의 형변환이 필요
        System.out.println(num6);

        //<final> 그냥 한 번 선언하면 값을 고정한다고 생각하면 된다.
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a","b"));
        //선언 이후에 값을 더하거나 뺄 수 없다.
        // But
        //if you're using "List", you can use method "add" or "remove"
        //so if you want to fix "list" data also?, you can use method "List.of"
        final List<String> a1 = List.of("a", "b");//List.of 메서드 사용
        a.add("C");//오류발생
    }
}
