package NoClassCalculrator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("===사칙연산 계산기===");

        // 첫번째 계산할 숫자 입력
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int firstNum = scanner.nextInt();

        // 두번째 계산할 숫자 입력
        System.out.print("두번째 숫자를 입력하세요 : ");
        int secondNum = scanner.nextInt();

        // 계산에 사용할 사칙연산 기호 입력
        System.out.print("원하는 사칙연산 기호를 입력하세요(+, -, *, /) : ");
        char operator = scanner.next().charAt(0);

        if (firstNum >= 0 && secondNum >= 0) {
            if (operator == '+') {
                System.out.println(firstNum + secondNum);
            } else if (operator == '-') {
                System.out.println(firstNum - secondNum);
            } else if (operator == '*') {
                System.out.println(firstNum * secondNum);
            } else if (operator == '/') {
                System.out.println(firstNum / secondNum);
            } else {
                System.out.println("사칙연산 값을 잘못 입력하셨습니다.");
            }
        } else {
            System.out.println("양의 정수를 입력하세요.");
        }



    }
}
