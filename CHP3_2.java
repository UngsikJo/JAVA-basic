public class CHP3_2 {
    public static void main(String[] args) {
        //boolean 참 또는 거짓의 값을 갖는 자료형

        boolean isSuccess = true;
        boolean isTest = false;
        //해당 자료형을 통해 if문과 같은 조건문에 사용가능

        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall){
            System.out.println("키가 큽니다.");
        }

        int i = 3;
        boolean isOdd = i%2==1; //i%2==1이 isOdd라는 변수에 들어가는 불린 값
        System.out.println(isOdd);



    }
}
