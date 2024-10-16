package Lv3Calculator;

public class Main{
    public static void main(String[] args) {
        boolean calculateEnded = false;

        while (!calculateEnded) {
            try {
                calculateEnded = App.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
