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
            int firstNum1 = scanner.nextInt();
            // 두번째 계산할 숫자 입력
            System.out.print("두번째 숫자를 입력하세요 : ");
            int secondNum1 = scanner.nextInt();
            // 계산에 사용할 사칙연산 기호 입력
            System.out.print("원하는 사칙연산 기호를 입력하세요(+, -, *, /) : ");
            char operator1 = scanner.next().charAt(0);
            scanner.nextLine();

            // 결과 값 반환
            int result = calculator.cal(firstNum1, secondNum1, operator1);

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
