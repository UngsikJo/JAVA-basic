package CHP4;

import java.util.ArrayList;
import java.util.Arrays;

public class CHP4_05 {
    public static void main(String[] args) {
        //<for문 활용 예제>
        String[] numbers = {"one", "two", "three"};
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //<for문을 for each문으로 바꾼 예제>
        for(String number: numbers){
            System.out.println(number);
        }

        //<ArrayList로 구현한 for each문>
        ArrayList<String> numbers1 = new ArrayList<>(Arrays.asList("one","two","three"));
        for(String number: numbers1){
            System.out.println(number);
        }

    }
}
