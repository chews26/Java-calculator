package Lv3Calculator;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Calculator {

    private ArrayList<Integer> resultlist = new ArrayList<>();
    private int result = 0;

    // enum 사용
    public enum Operation {
        ADD('+'),
        SUBTRACT('-'),
        MULTIPLY('*'),
        DIVIDE('/');

        // 각각에 값을 대입
        private char symbol;

        // 생성자 Operation
        // enum에서는 생성자를 private 설정하는 것이 기본..
        private Operation(char symbol) { //char symbol = 매개변수
            this.symbol = symbol;
        }

        // 메소드(함수)
        public char getSymbol() {
            return symbol;
        }

        // 연산자로 enum이랑 대입해서 일치하는지 확인
        // >> 함수는 왜그런지 한번 더 체크 필요
        public static Operation operationType(char symbol) {
            for (Operation optype : Operation.values()) {
                if (optype.getSymbol() == symbol) {
                    return optype;
                }
            }
            return null;
        }
    }

    // enum으로 선언한 연산자를 기반으로 계산하기
    // 입력값 operator를 대입하는 것이랑 차이점을 모르겠음 > enum 활용법을 더 찾아봐야할 듯
    // 보기 쉽게 Case문으로 작성
    public int cal(int firstNum, int secondNum, Operation operation)  {
        switch (operation) {
            case ADD:
                System.out.println("결과 : " + (firstNum + secondNum));
                result = firstNum + secondNum;
                break;
            case SUBTRACT:
                System.out.println("결과 : " + (firstNum - secondNum));
                result = firstNum - secondNum;
                break;
            case MULTIPLY:
                System.out.println("결과 : " + (firstNum * secondNum));
                result = firstNum * secondNum;
                break;
            case DIVIDE:
                if(secondNum == 0){
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                System.out.println("결과 : " + (firstNum / secondNum));
                result = firstNum / secondNum;}
            default:
                System.out.println("사칙연산 값을 잘못 입력하셨습니다."); // 사칙연산 값을 잘못 입력했을 경우 오류값 출력
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





