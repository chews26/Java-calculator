package ClassCalculrator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Calculator 메서드
        Calculator calculator = new Calculator();
        // 입력 생성
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========Class 사칙연산 계산기==========");

        while (true) {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int firstNum = scanner.nextInt();
            // 두번째 계산할 숫자 입력
            System.out.print("두번째 숫자를 입력하세요 : ");
            int secondNum = scanner.nextInt();
            // 계산에 사용할 사칙연산 기호 입력
            System.out.print("원하는 사칙연산 기호를 입력하세요(+, -, *, /) : ");
            char operator = scanner.next().charAt(0);
            scanner.nextLine();

            // 결과 값 반환
            int result = calculator.cal(firstNum, secondNum, operator);
            System.out.println("");

            // resultlist에 저장된 값 출력
            System.out.println("저장된 결과값 :" + calculator.resultlist);
            // resultlist에 저장된 결과값 삭제
            System.out.println("결과값을 삭제하고 싶으시면 y 아니면 n을 입력해주세요");
            String removeAnswer = scanner.nextLine();
            if (removeAnswer.equals("n")) {
                continue;
            } else if (removeAnswer.equals("y")) {
                System.out.println("삭제하고 싶은 인덱스 번호를 입력하세요");
                ;
                int indexRemove = scanner.nextInt();
                calculator.resultlist.remove(indexRemove);
                System.out.println("수정 후 결과값 : " + calculator.resultlist);
                System.out.println("");


                // 재 계산 여부 물어보기
                System.out.println("더 계산을 원하시면 아무키나 눌러주세요 (exit 입력 시 종료)");
                String answer = scanner.nextLine();

                if (answer.equals("exit")) {
                    break;
                } else {
                    System.out.println("=========================================");
                }
            }

        }
    }
}
