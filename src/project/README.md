# **Java 콘솔 계산기 프로젝트**

## 1. 프로젝트 개요
이 프로젝트는 **4단계(Level)로 구성된 Java 콘솔 기반 사칙연산 계산기**다.  
각 단계마다 기능이 확장되며, 점점 더 복잡한 계산을 수행할 수 있도록 설계되었다.

---

## 2. 프로젝트 구조
```plaintext
project/
│── lv1/   # Level 1: 기본 계산기
│   └── App.java
│
│── lv2/   # Level 2: 입력 검증 및 결과 저장
│   ├── App.java
│   └── Calculator.java
│
│── lv3/   # Level 3: Enum을 활용한 연산 처리
│   ├── App.java
│   ├── Calculator.java
│   └── OperatorType.java
│
│── lv4/   # Level 4: 실수(double) 연산 지원
│   ├── App.java
│   ├── Calculator.java
│   └── OperatorType.java
│
└── README.md   # 프로젝트 설명 파일
```

---

##  Level 1: 기본 계산기
### ** 주요 기능 **
✔ **사용자가 양의 정수 2개를 입력**하고 **사칙연산 기호(+,-,*,/)를 선택**하여 계산 수행  
✔ **0으로 나누는 오류를 방지**하며, `exit` 입력 시 프로그램 종료  
✔ **`switch` 문을 사용하여 연산 수행**

### ** 실행 예시 **
```plaintext
첫 번째 정수를 입력하세요.(종료하려면 'exit' 입력): 10
두 번째 정수를 입력하세요: 5
사칙연산 기호(＋,－,×,÷)를 입력하세요: /
2
```

---

## Level 2: 입력 검증 및 결과 저장
### ** 주요 기능 **
✔ **사용자가 정수가 아닌 값을 입력할 경우 재입력 요청**  
✔ **연산 결과를 `ArrayList`에 저장**하여 기록 유지  
✔ **사용자가 원하는 경우 가장 오래된 연산 결과를 삭제할 수 있음**

### ** 실행 예시 **
```plaintext
첫 번째 정수를 입력하세요: 10
두 번째 정수를 입력하세요: 5
사칙연산 기호: +
결과 값: 15
저장된 결과 값: [15]

오래된 연산 결과를 삭제하시겠습니까? (yes/no): yes
저장된 결과 값: []
```

---

## Level 3: Enum을 활용한 연산 처리
### ** 주요 기능 **
✔ **연산자를 `Enum(OperatorType)`으로 정의하여 연산 수행**  
✔ **각 연산(`+`, `-`, `*`, `/`)을 `Enum` 내부에서 처리**  
✔ **연산을 `switch` 문 대신 `Enum`의 메서드를 호출하여 실행**

### **  예시 **
```plaintext
첫 번째 정수를 입력하세요: 8
두 번째 정수를 입력하세요: 2
사칙연산 기호: /
lv3result = 4
```

---

## Level 4: 실수(double) 연산 지원
### ** 주요 기능 **
✔ **입력값을 `double`까지 허용**하여 실수 연산 가능  
✔ **연산 결과를 `Number` 타입으로 처리하여 정수/실수를 자동 구분**  
✔ **연산을 `BiFunction`과 `Enum`을 활용하여 수행**

### ** 실행 예시 **
```plaintext
첫 번째 숫자를 입력하세요: 7
두 번째 숫자를 입력하세요: 2
사칙연산 기호: /
결과: 3.5
```
```plaintext
첫 번째 숫자를 입력하세요: 10
두 번째 숫자를 입력하세요: 5
사칙연산 기호: /
결과: 2.0
```

---

## 3. 최종 결론
✔ **각 단계별로 점진적으로 기능이 추가되며, 유지보수와 확장성을 고려한 코드로 개선됨**  
✔ **입력 검증, 결과 저장, `Enum` 활용, 실수 연산 지원까지 점진적으로 업그레이드됨**  
✔ **최종적으로 `double` 연산까지 완벽하게 지원하며, 연산 결과를 `Number` 타입으로 유지**

---