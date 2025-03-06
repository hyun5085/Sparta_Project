package project.lv4;

import java.util.ArrayList;

public class Calculator<T extends Number> {

    ArrayList<Number> arrayList = new ArrayList();

    // 1. 속성
    private T lv4value1;
    private T lv4value2;
    private char lv4symbol;
    private Number lv4result;



    public Number Arithmetic  (T lv4num1, T lv4num2, char lv4Bsymbol) {
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

//        현재는 시간 없어서 제출.( 소수점이 없을 때는 없이 출력되게 하고 싶으나 추후 개선 해볼 예정 )
//        Number은 int, double을 둘 다 지원하는데.... String 변화로 출력은 되지만.. 숫자로 데이터를 남기고 싶음
//        밑에를 사용하려면 위에 ArrayList도 String으로 바꿔줘야함....

//        String formattedResult;
//        if (lv4result.doubleValue() % 1 == 0) {
//            formattedResult = String.format("%.0f", lv4result.doubleValue()); // 정수로 저장
//        } else {
//            formattedResult = String.valueOf(lv4result); // 실수 그대로 저장
//        }
//        // 결과 값 저장
//        arrayList.add(formattedResult);
//        // 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후 2) 결과 값을 반환하는 메서드 생성
//        return formattedResult;
    }

}
