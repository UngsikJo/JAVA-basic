import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

public class CHP3_9 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        //<교집합>
        HashSet<Integer> intersection = new HashSet<>(s1);//교집합 공간 생성후 s1대입
        intersection.retainAll(s2);//교집합메서드인 retainAll사용
        System.out.println(intersection);

        //<합집합>
        HashSet<Integer> union = new HashSet<>(s1);//합집합을 위한 공간 생성후 s1대입
        union.addAll(s2);//중복이 안된다는 특징을 이용하여 그냥 다 더해준거
        System.out.println(union);

        //<차집합>
        HashSet<Integer> subtract = new HashSet<>(s1);//차집합을 위한 공간 생성후 s1대입
        subtract.removeAll(s2);//차집합 메서드 removeAll사용
        System.out.println(subtract);

        //<집합 관련 메서드들 3개>
        HashSet<String> Exam = new HashSet<>();
        Exam.add("Jump");//add 메서드
        Exam.add("to");
        Exam.add("Java");
        System.out.println(Exam);
        ArrayList<String> Exam1 = new ArrayList<>(Exam);
        String result = String.join(" ", Exam1);
        System.out.println(result);

        Exam.addAll(Arrays.asList( "is","so", "fun!"));
        System.out.println(Exam);

        Exam.remove("so");
        System.out.println(Exam);
    }
}
