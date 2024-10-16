package Lv3Calculator;

import java.util.Scanner;

public class App {

    //    public static void main(String[] args) {
    public static boolean start() throws Exception {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========Lv3. 사칙연산 계산기==========");

        while (true) {
            // 입력
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int firstNum = scanner.nextInt();
            // throw로 양의 정수가 아닐 시 BadException 반환
            if (firstNum < 0) {
                throw new BadException("양의 정수");
            }

            System.out.print("두번째 숫자를 입력하세요 : ");
            int secondNum = scanner.nextInt();
            // throw로 양의 정수가 아닐 시 BadException 반환
            if (secondNum < 0) {
                throw new BadException("양의 정수");
            }

            System.out.print("원하는 사칙연산 기호를 입력하세요(+, -, *, /) : ");
            char operator = scanner.next().charAt(0);
            scanner.nextLine();

            // >> 입력된 연산자를 enum에 넣어야 한다. 어떻게?
            Calculator.Operation operation = Calculator.Operation.operationType(operator);
            if (operation == null) {
                System.out.println("잘못된 연산자입니다. 다시 시도해주세요.");
            }
            //결과값 반환
            int result = calculator.cal(firstNum, secondNum, operation);
            System.out.println("");

            // resultlist에 저장된 값 출력
            System.out.println("저장된 결과값 :" + calculator.getResultlist());

            // resultlist에 저장된 결과값 삭제?
            System.out.println("가장 먼저 저장된 결과값을 삭제하고 싶으시면 y 아니면 아무키나 입력해주세요");
            String removeAnswer = scanner.nextLine();
            if (removeAnswer.equals("y")) {

                // resultList에 저장된 결과값 삭제
                calculator.setRemoveResult(); // set으로 입력된 인덱스 수정
                System.out.println("삭제 후 결과값 : " + calculator.getResultlist());
                System.out.println("");
            } else {
            }

            // 재 계산 여부 물어보기
            System.out.println("더 계산을 원하시면 아무키나 눌러주세요 (exit 입력 시 종료)");
            String answer = scanner.nextLine();
//                scanner.next();

            if (answer.equals("exit")) {
                break;
            } else {
                System.out.println("=========================================");
            }
        }
        return true;
    }
}
