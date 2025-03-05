package project.lv3;

public enum OperatorType {
    ADD('+') {
        @Override
        public int lv3result(int lv3value1, int lv3value2) {
            return lv3value1 + lv3value2;
        }
    },
    SUB('-') {
        @Override
        public int lv3result(int lv3value1, int lv3value2) {
            return lv3value1 - lv3value2;
        }
    },
    MUL('*') {
        @Override
        public int lv3result(int lv3value1, int lv3value2) {
            return lv3value1 * lv3value2;
        }
    },
    DIV('/') {
        @Override
        public int lv3result(int lv3value1, int lv3value2) {
            if (lv3value2 == 0) {
                System.out.println("⚠ 0으로 나눌 수 없습니다.");
                return 0;
            }
            return lv3value1 / lv3value2;
        }
    };

    private final char lv3symbol;

    // 생성자
    OperatorType(char lv3symbol) {
        this.lv3symbol = lv3symbol;
    }

    //
    public abstract int lv3result(int lv3value1, int lv3value2);

    public char getSymbol() {
        return lv3symbol;
    }

    // 입력된 연산 기호 App -> Calculator -> getSymbol
    public static OperatorType getSymbol(char lv3Csymbol) {
        // OperatorType [ ADD, SUB, MUL, DIV ] 을 찾음
        for (OperatorType operatorType : OperatorType.values()) {
            if (operatorType.lv3symbol == lv3Csymbol) {
                return operatorType;
            }
        }
        throw new IllegalArgumentException("잘못된 연산 기호입니다: " + lv3Csymbol);
    }
}
