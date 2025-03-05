package project.lv3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Consol 창에 "Hello, Calculator" 출력 확인
        System.out.println("Hello, Let's start the Calculator");
        // Scanner를 사용하기 위한 초기 설정
        Scanner lv3scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        // 반복문을 사용
        // 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기
        while(true){
            // 양의 정수(0 포함)를 입력받기
            // Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
            // 양의 정수는 각각 하나씩 전달 받습니다.
            // 양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.
            int lv3value1;

            // 수정하기 (처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
            while(true) {
                System.out.println("첫 번째 정수를 입력하세요.(종료하려면 'exit' 입력):");

                //*** 사용자가 exit 를 입력 했는지 확인 ***
                if (lv3scanner.hasNext("exit")) {
                    System.out.println("계산기를 종료합니다.");
                    return;
                }
                //*** 사용자가 정수를 입력했는지 확인***
                if (!lv3scanner.hasNextInt()) {
                    System.out.println("유효한 정수를 입력해주세요.");
                    //*** 정수가 입력되지 않았으면 그 안에 빈 데이터를 입력하면서 초기화 ***
                    lv3scanner.next();
                    //
                    continue;
                }
                lv3value1 = lv3scanner.nextInt();

                if (lv3value1 < 0) {
                    System.out.println("양의 정수(0 포함)를 입력해주세요.");
                    continue;
                }
                break;
            }

            // 양의 정수는 각각 하나씩 전달 받습니다.
            // 양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.
            int lv3value2;
            // 수정하기 (처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
            while(true) {
                System.out.println("두 번째 정수를 입력하세요:");
                if (!lv3scanner.hasNextInt()) {
                    System.out.println("유효한 정수를 입력해주세요.");
                    lv3scanner.next();
                    continue;
                }
                lv3value2 = lv3scanner.nextInt();

                if (lv3value2 < 0) {
                    System.out.println("양의 정수(0 포함)를 입력해주세요.");
                    continue;
                }
                break;
            }

            // 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. (charAt(0))
            char lv3Asymbol;
            // 수정하기 (처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
            while(true) {
                System.out.println("사칙연산 기호(＋,－,×,÷)를 입력하세요:");
                String lv3Input = lv3scanner.next();
                if (lv3Input.length() == 1 && " +-*/".contains(lv3Input)) {
                    lv3Asymbol = lv3Input.charAt(0);
                    break;
                } else {
                    System.out.println("유효하지 않은 연산 기호입니다.");
                }
            }

            int lv3result1 = calculator.Arithmetic (lv3value1, lv3value2, lv3Asymbol);
            System.out.println("lv3result = " + lv3result1);
            System.out.println(calculator.arrayList);

            while(true) {
                System.out.println("오래된 연산 결과를 삭제하시겠습니까?(yes/no)");
                String lv3delete = lv3scanner.next();
                if(lv3delete.equalsIgnoreCase("yes")){
                    calculator.arrayList.remove(0);
                    System.out.println(calculator.arrayList);
                    break;
                } else if (lv3delete.equalsIgnoreCase("no")){
                    System.out.println("결과를 유지합니다.");
                    break;
                } else {
                    System.out.println("잘못된 입력 입니다. 다시 입력해주세요.");
                }

            }


        }
    }
}
