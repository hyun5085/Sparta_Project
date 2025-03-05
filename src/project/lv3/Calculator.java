package project.lv3;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> arrayList = new ArrayList<>();

    // 1. 속성
    private int lv3value1;
    private int lv3value2;
    private char lv3symbol;
    private int lv3result;

    public int Arithmetic(int lv3num1, int lv3num2, char lv3Bsymbol) {
        this.lv3symbol = lv3Bsymbol;
        this.lv3value1 = lv3num1;
        this.lv3value2 = lv3num2;

        // ✅ OperatorType에서 연산 기호를 찾아서 가져옴
        OperatorType operatorType = OperatorType.getSymbol(lv3Bsymbol);

        // ✅ OperatorType을 통해 연산 수행
        lv3result = operatorType.lv3result(lv3value1, lv3value2);

        arrayList.add(lv3result);  // ✅ 결과 저장

        return lv3result;  // ✅ 연산 결과 반환
    }
}
