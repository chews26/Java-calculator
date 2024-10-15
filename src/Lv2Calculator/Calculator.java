package Lv2Calculator;

import java.util.ArrayList;

public class Calculator {

    // 필드 선언, private으로 클래스 내부에서만 읽을 수 있게
    private ArrayList<Integer> resultlist = new ArrayList<>();
    private int result = 0; // 결과값에 대한 기본값을 0으로 줌
    // firstNum : input 첫번째 대입 숫자
    // secondNum : input 두번째 대입 숫자
    // operator : input 사칙연산 대입자

    // 계산 및 오류검증
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

        // 결과값인 result를 resultlist에 저장
        resultlist.add(result);
        return result;
    }

    // 결과 리스트 반환 (getter)
    public ArrayList<Integer> getResultlist() {
        return resultlist;
    }

    // 맨처음 저장된 결과 리스트 인덱스 값 삭제 (setter)
    public void setRemoveResult() {
        resultlist.remove(0);
    }
}

//   // 결과 리스트에서 특정 인덱스 값 삭제 (setter)
//    public void setRemoveResult(int index) {
//        if (index < resultlist.size()) { // index사이즈가 index사이즈보다 작으면 실행되도록
//            resultlist.remove(0);
//            System.out.println("결과가 성공적으로 삭제되었습니다.");
//        } else {
//            System.out.println("잘못된 인덱스입니다. 삭제할 수 없습니다.");
//        }
//    }


