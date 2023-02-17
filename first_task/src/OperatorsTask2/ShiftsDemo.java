package OperatorsTask2;

public class ShiftsDemo {
    public static void main(String[] args) {
        int a = 0b011;
        int b = -0b111;

        a = a << 2;
        b = b << 2;

        a = a >> 2;
        b = b >> 2;

        b = b >>> 3;
        a = a >>> 3;

        System.out.println(a + " " + b);
    }
}
