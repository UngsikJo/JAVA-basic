public class CHP3_1 {
    public static void main(String[] args) {
        int age = 10;
        long countOfStar = 81723987123L; //long 자료형 선언시 L누락시 컴파일 오류

        //실수
        //float, double
        float pi = 3.14F; //float선언시 F,f접미사 붙여줘야 함.
        double morPi = 3.141592189237;
        double d = 123.4;
        double d2 = 1.234e2;//지수 표현 식 d = d2

        //8진수와 16진수
        int octal = 023; //0으로 시작하면 8진수
        int hex = 0xC3; //0x로 시작하면 16진수

        //숫자 연산(+-*/)
        int a= 10;
        int b =5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        //나머지 연산 %
        System.out.println(7%3);
        System.out.println(3%7);
        //증감연산 (++, --)
        int i = 0;
        int j = 10;
        i++;
        j--;
        System.out.println(i);
        System.out.println(j);

        int t = 0;
        System.out.println(t++);//선 대입 후 연산 반대로 ++t는 선 연산 후 대입이다.
        System.out.println(t);




    }
}
