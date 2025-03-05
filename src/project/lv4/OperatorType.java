package project.lv4;

import java.util.function.BiFunction;
// Enum(Enumeration)은 서로 관련 있는 상수(Constant) 값들의 집합을 정의할 때 사용하는 특별한 데이터 타입
public enum OperatorType {
    // 람다식 구현
    ADD('+', (lv4value1, lv4value2) -> lv4value1 + lv4value2),
    SUB('-', (lv4value1, lv4value2) -> lv4value1 - lv4value2),
    MUL('*', (lv4value1, lv4value2) -> lv4value1 * lv4value2),
    DIV('/', (lv4value1, lv4value2) -> {
        if (lv4value2 == 0) {System.out.println("0으로 나눌 수 없습니다.");
            return 0;  //
        }
        return lv4value1 / lv4value2;
    });

    // enum 변수 선언
    BiFunction<Integer, Integer, Integer> function;
    private char lv4symbol;


    // OperatorType은 Char형 lv4symbol, BiFunction Interger형 function
    OperatorType(char lv4symbol, BiFunction<Integer, Integer, Integer> function){
        this.function = function;
        this.lv4symbol = lv4symbol;

    }

    // OperatorType은 결과값
    public int lv4result(int lv4value1, int lv4value2) {
        return function.apply(lv4value1, lv4value2);
    }

    // 사칙 연산 기호 찾기!
    public static OperatorType getSymbol(char lv4Csymbol){
        // OperatorType.values(ADD, SUB, MUL, DIV) 값을 둘러봄
        for (OperatorType operatorType : OperatorType.values()){
            // 같은 심볼이 딱~~~ 나오면 그 람다식만 불러오기~~
            if (operatorType.lv4symbol == lv4Csymbol){
                return operatorType;
            }
            // 실제로 나올 일은 없음. ( App에서 이미 사칙 연산 기호를 걸러 버리기 때문 )
        }throw new IllegalArgumentException("잘못된 연산 기호입니다: " + lv4Csymbol);
    }




}
