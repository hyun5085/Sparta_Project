package project.lv2;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> arrayList = new ArrayList();

    // 1. 속성
    private int lv2value1;
    private int lv2value2;
    private char lv2symbol;
    private int lv2result;


    //
    public int Arithmetic  (int lv2num1, int lv2num2, char lv2mysymbol) {
        this.lv2symbol = lv2mysymbol;
        this.lv2value1 = lv2num1;
        this.lv2value2 = lv2num2;

        lv2result = 0;

        switch (lv2mysymbol) {

            case '+':
                lv2result = lv2num1 + lv2num2;
                // 잘못된 연산자는 저장하지 않기 위해 각 계산 끝나는 곳에 넣음
                arrayList.add(lv2result);
                break;
            case '-':
                lv2result = lv2num1 - lv2num2;
                // 잘못된 연산자는 저장하지 않기 위해 각 계산 끝나는 곳에 넣음
                arrayList.add(lv2result);
                break;
            case '*':
                lv2result = lv2num1 * lv2num2;
                // 잘못된 연산자는 저장하지 않기 위해 각 계산 끝나는 곳에 넣음
                arrayList.add(lv2result);
                break;
            case '/':
                if (lv2num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                } else {
                    lv2result = lv2num1 / lv2num2;
                    // 연산 결과를 저장하는 컬렉션 타입 필드 생성 --
                    // 잘못된 연산자는 저장하지 않기 위해 각 계산 끝나는 곳에 넣음
                    arrayList.add(lv2result);
                    break;
                }
            default:
                System.out.println("유효하지 않은 연산 기호입니다.\n사칙연산 기호(＋,－,×,÷)를 입력하세요 ");

        }

        // 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후 2) 결과 값을 반환하는 메서드 생성
        return lv2result;
    }

}
