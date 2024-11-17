package CHP4;

public class CHP4_03 {
    //<while문>
    public static void main(String[] args) {
        //<while문의 기본 구조>
        int treeHit = 0;
        while (treeHit < 10){
            treeHit++;
            System.out.println("나무를"+ treeHit + "번 찍었습니다.");
            if (treeHit==10){
                System.out.println("나무 넘어갑니다");
            }
        }
        //while문의 조건문이 참일시 계속 while문 안의 문장들을 수행한다.

        //<무한루프>  --> 아직은 쓸데 없어서 그냥 주석처리 해놓음.
        //while(true){
        //    System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");
        //}
        //무한 루프는 모든 프로그램에서 사용할 만큼 중요함.

        //<while문 빠져나가기 -break>
        int coffee = 10;
        int money = 300;

        while(money > 0){
            System.out.println("돈을 받았으니 커피를 줍니다");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee + "입니다.");
            if(coffee == 0){
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
                break;
            }
        }

        //<while문으로 돌아가기 continue>
        int a = 0;
        while(a<10){
            a++;
            if(a % 2 == 0){
                continue; //while문의 조건문으로 돌아가라는 의미
            }
            System.out.println(a);// 그래서 if문 내에서 조건이 걸려 continue를 만나게 되면 그 뒤에 문장에 닿지 못함.
        }
    }

}
