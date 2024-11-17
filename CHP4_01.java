package CHP4;

import java.util.ArrayList;

public class CHP4_01 {
    public static void main(String[] args) {
        //<boolean을 이용한 if문 사용예제>
        boolean money = true;
        if(money){
            System.out.println("택시를 타고 가라");
        }
        else{
            System.out.println("걸어가라");
        }

        //<비교연산자> ==, >, <, !=, >=, <=
        int x =3;
        int y = 2;
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x!=y);

        //<비교연산자 사용 예제>
        int money1 = 2000;
        if(money1>=3000){
            System.out.println("택시를 타고 가라");
        }
        else{
            System.out.println("걸어가라");
        }

        //<조건연산자>
        //&&, ||, !
        int money2 = 2000;
        boolean hascard = true;

        if((money2>=3000) || hascard){
            System.out.println("택시를 타고 가라");
        }
        else{
            System.out.println("걸어가라");
        }
        //<메서드 값에 의한 조건문 사용>
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("handphone");

        if(pocket.contains("money")){
            System.out.println("택시를 타고 가라");
        }
        else{
            System.out.println("걸어가라");
        }
        //if-else if- else문
        if(pocket.contains("money")){//거짓
            System.out.println("택시를 타고 가라");
        }
        else if(hascard){//참
            System.out.println("택시를 타고 가라");
        }
        else{
            System.out.println("걸어가라");
        }

    }
}
