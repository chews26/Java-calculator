package ClassCalculrator;

import java.util.ArrayList;

public class Calculator {

    // 필드 선언
    ArrayList<Integer> resultlist = new ArrayList<>();
    int result = 0;
    // 오류 검증


    // 계산
    public int cal(int firstNum, int secondNum, char operator) {
        if (firstNum >= 0 && secondNum >= 0) {
            if (operator == '+') {
                System.out.println("결과 : " + (firstNum + secondNum));
                result = firstNum + secondNum;
            } else if (operator == '-') {
                System.out.println("결과 : " + (firstNum - secondNum));
                result = firstNum - secondNum;
            } else if (operator == '*') {
                System.out.println("결과 : " + (firstNum * secondNum));
                result = firstNum * secondNum;
            } else if (operator == '/') {
                if (secondNum == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return 0;
                } else {
                    System.out.println("결과 : " + (firstNum / secondNum));
                    result = firstNum / secondNum;
                }
            } else {
                System.out.println("사칙연산 값을 잘못 입력하셨습니다.");
                return 0;
            }
        } else { // 양의 정수를 입력하지 않을 경우 알림
            if (firstNum < 0 && secondNum < 0) {
                System.out.println("양의 정수를 입력하세요.");
                return 0;
            } else if (firstNum < 0) {
                System.out.println("첫번째 자리에 양의 정수를 입력하세요.");
                return 0;
            } else {
                System.out.println("두번째 자리에 양의 정수를 입력하세요.");
                return 0;
            }
        }
        // List에 저장
        resultlist.add(result);
        return result;

        // List 출력
    }
}