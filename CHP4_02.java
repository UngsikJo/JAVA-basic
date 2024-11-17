package CHP4;

public class CHP4_02 {
    public static void main(String[] args) {
        //<switch/case문>
                int month = 8;
                String monthString = "";//String자료형 선언후 초기화
                switch (month) {  // 입력 변수의 자료형은 byte, short, char, int, enum, String만 가능하다.
                    case 1:  monthString = "January";
                        break;
                    case 2:  monthString = "February";
                        break;
                    case 3:  monthString = "March";
                        break;
                    case 4:  monthString = "April";
                        break;
                    case 5:  monthString = "May";
                        break;
                    case 6:  monthString = "June";
                        break;
                    case 7:  monthString = "July";
                        break;
                    case 8:  monthString = "August";
                        break;
                    case 9:  monthString = "September";
                        break;
                    case 10: monthString = "October";
                        break;
                    case 11: monthString = "November";
                        break;
                    case 12: monthString = "December";
                        break;
                    default: monthString = "Invalid month";
                        break;
                }
                System.out.println(monthString);
            }


    }
