package project.lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Consol 창에 "Hello, Calculator" 출력 확인
        System.out.println("Hello, Let's start the Calculator");
        // Scanner를 사용하기 위한 초기 설정
        Scanner lv1scanner = new Scanner(System.in);

        // 반복문을 사용
        // 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기
        while(true){
            // 양의 정수(0 포함)를 입력받기
            // Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
            // 양의 정수는 각각 하나씩 전달 받습니다.
            // 양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.
            int lv1value1 = 0;

            // 수정하기 (처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
            while(true) {
                System.out.println("첫 번째 정수를 입력하세요.(종료하려면 'exit' 입력):");

                //*** 사용자가 exit 를 입력 했는지 확인 ***
                if (lv1scanner.hasNext("exit")) {
                    System.out.println("계산기를 종료합니다.");
                    return;
                }
                //*** 사용자가 정수를 입력했는지 확인***
                if (!lv1scanner.hasNextInt()) {
                    System.out.println("유효한 정수를 입력해주세요.");
                    //*** 정수가 입력되지 않았으면 그 안에 빈 데이터를 입력하면서 초기화 ***
                    lv1scanner.next();
                    //
                    continue;
                }
                lv1value1 = lv1scanner.nextInt();

                if (lv1value1 < 0) {
                    System.out.println("양의 정수(0 포함)를 입력해주세요.");
                    continue;
                }
                break;
            }

            // 양의 정수는 각각 하나씩 전달 받습니다.
            // 양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.
            int lv1value2 = 0;
            // 수정하기 (처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
            while(true) {
                System.out.println("두 번째 정수를 입력하세요:");
                if (!lv1scanner.hasNextInt()) {
                    System.out.println("유효한 정수를 입력해주세요.");
                    lv1scanner.next();
                    continue;
                }
                lv1value2 = lv1scanner.nextInt();

                if (lv1value2 < 0) {
                    System.out.println("양의 정수(0 포함)를 입력해주세요.");
                    continue;
                }
                break;
            }

            // 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. (charAt(0))
            char lv1symbol = ' ';
            // 수정하기 (처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
            while(true) {
                System.out.println("사칙연산 기호(＋,－,×,÷)를 입력하세요:");
                String lv1Input = lv1scanner.next();
                if (lv1Input.length() == 1 && " +-*/".contains(lv1Input)) {
                    lv1symbol = lv1Input.charAt(0);
                    break;
                } else {
                    System.out.println("유효하지 않은 연산 기호입니다.");
                }

            }

            // 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
            // 키워드 : if switch
            switch (lv1symbol) {
                // 사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
                case '+':
                    System.out.println(lv1value1 + lv1value2);
                    break;
                // 사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
                case '-':
                    System.out.println(lv1value1 - lv1value2);
                    break;
                // 사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
                case '*':
                    System.out.println(lv1value1 * lv1value2);
                    break;
                // 사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
                // 연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.
                //  ex) “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“
                case '/':
                    if (lv1value2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        System.out.println(lv1value1 / lv1value2);
                        break;
                    }
                default:
                    System.out.println("유효하지 않은 연산 기호입니다.\n사칙연산 기호(＋,－,×,÷)를 입력하세요 ");

            }

        }

    }
}
