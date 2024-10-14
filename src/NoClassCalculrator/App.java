package NoClassCalculrator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("==========noClass 사칙연산 계산기==========");

        System.out.print("원하는 조건문을 선택하세요(if, while, case) : ");
        String option = scanner.nextLine();

        switch (option) {
            // 1. IF문으로 조건을 만족할 경우 계산하도록 작성
            case "if":
                // 첫번째 계산할 숫자 입력
                System.out.print("첫번째 숫자를 입력하세요 : ");
                int firstNum0 = scanner.nextInt();
                // 두번째 계산할 숫자 입력
                System.out.print("두번째 숫자를 입력하세요 : ");
                int secondNum0 = scanner.nextInt();
                // 계산에 사용할 사칙연산 기호 입력
                System.out.print("원하는 사칙연산 기호를 입력하세요(+, -, *, /) : ");
                char operator0 = scanner.next().charAt(0);

                if (firstNum0 >= 0 && secondNum0 >= 0) {
                    if (operator0 == '+') {
                        System.out.println("결과 : " + (firstNum0 + secondNum0));
                    } else if (operator0 == '-') {
                        System.out.println("결과 : " + (firstNum0 - secondNum0));
                    } else if (operator0 == '*') {
                        System.out.println("결과 : " + (firstNum0 * secondNum0));
                    } else if (operator0 == '/') {
                        if (secondNum0 == 0) {
                            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        } else {
                            System.out.println("결과 : " + (firstNum0 / secondNum0));}
                    } else {
                        System.out.println("사칙연산 값을 잘못 입력하셨습니다.");
                    }
                } else { // 양의 정수를 입력하지 않을 경우 알림
                    if (firstNum0 < 0 && secondNum0 < 0) {
                        System.out.println("양의 정수를 입력하세요.");
                    } else if (firstNum0 < 0) {
                        System.out.println("첫번째 자리에 양의 정수를 입력하세요.");
                    } else {
                        System.out.println("두번째 자리에 양의 정수를 입력하세요.");
                    }
                }
                System.out.println("=========================================");
                break;


            // 2. while문으로 특정 조건을 만족하기 전까지 연산을 반복하도록 작성
            case "while":
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

                    if (firstNum1 >= 0 && secondNum1 >= 0) {
                        if (operator1 == '+') {
                            System.out.println("결과 : " + (firstNum1 + secondNum1));
                        } else if (operator1 == '-') {
                            System.out.println("결과 : " + (firstNum1 - secondNum1));
                        } else if (operator1 == '*') {
                            System.out.println("결과 : " + (firstNum1 * secondNum1));
                        } else if (operator1 == '/') {
                            if (secondNum1 == 0) {
                                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                            } else {
                            System.out.println("결과 : " + (firstNum1 / secondNum1));}
                        } else {
                            System.out.println("사칙연산 값을 잘못 입력하셨습니다.");
                        }
                    } else { // 양의 정수를 입력하지 않을 경우 알림
                        if (firstNum1 < 0 && secondNum1 < 0) {
                            System.out.println("양의 정수를 입력하세요.");
                        } else if (firstNum1 < 0) {
                            System.out.println("첫번째 자리에 양의 정수를 입력하세요.");
                        } else {
                            System.out.println("두번째 자리에 양의 정수를 입력하세요.");
                        }
                    }
                    System.out.println("더 계산을 원하시면 아무키나 눌러주세요 (exit 입력 시 종료)");
                    String answer = scanner.nextLine();

                    if (answer.equals("exit")) {
                        break;
                    } else {
                        System.out.println("=========================================");
                    }
                }

//            // 3. Case문으로 계산기 작성
//            case "case":
//                while (true) {
//                    System.out.print("첫번째 숫자를 입력하세요 : ");
//                    int firstNum2 = scanner.nextInt();
//                    // 두번째 계산할 숫자 입력
//                    System.out.print("두번째 숫자를 입력하세요 : ");
//                    int secondNum2 = scanner.nextInt();
//                    // 계산에 사용할 사칙연산 기호 입력
//                    System.out.print("원하는 사칙연산 기호를 입력하세요(+, -, *, /) : ");
//                    char operator2 = scanner.next().charAt(0);
//                    scanner.nextLine();



                }
        }
    }

