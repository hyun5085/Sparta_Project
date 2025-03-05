package project.lv4;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> arrayList = new ArrayList();

    // 1. 속성
    private int lv4value1;
    private int lv4value2;
    private char lv4symbol;
    private int lv4result;



    public int Arithmetic  (int lv4num1, int lv4num2, char lv4Bsymbol) {
        this.lv4symbol = lv4Bsymbol;
        this.lv4value1 = lv4num1;
        this.lv4value2 = lv4num2;

        lv4result = 0;


        OperatorType operator = OperatorType.getSymbol(lv4Bsymbol);

        // OperatorType을 통해 연산 수행
        // 연산이 수행되고 나서 그 결과 값을 lv4result 로 표현
        lv4result = operator.lv4result(lv4num1, lv4num2);

        arrayList.add(lv4result);  // 결과 저장

        // 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후 2) 결과 값을 반환하는 메서드 생성
        return lv4result;
    }

}
