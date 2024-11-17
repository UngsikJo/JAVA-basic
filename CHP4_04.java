package CHP4;

public class CHP4_04 {
    public static void main(String[] args) {
        //<for문의 기본구조> for(초깃값, 조건문, 증갓값)
        String[] number = {"one", "two", "three"};
        for(int i = 0; i< number.length; i++){
            System.out.println(number[i]);
        }

        //<for활용 예제>
        int[] mark = {90, 25, 67, 25, 80};
        for(int i =0; i<mark.length ; i++){
            if(mark[i]>= 60){
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }
            else{
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }
        //<continue문 예제>
        int[] mark1 = {90, 25, 67, 25, 80};
        for(int i =0; i<mark.length; i++){
            if(mark[i]<60){
                continue;
            }
            System.out.println((i+1)+"번 학생은 합격입니다.");
        }

        //<이중 for문 예제>
        for(int i =2; i< 10; i++){
            for(int j = 1; j<10;j++){
                System.out.print((i*j)+" ");//print는 \n을 포함하지 않고 출력
            }
            System.out.println(" ");//println은 \n을 포함하여 출력
        }
    }
}
