package Lv3Calculator;

public class BadException extends Exception {
    public BadException(String type) {
        super("잘못된 입력입니다! " + type + "을 입력해주세요!");
    }
}