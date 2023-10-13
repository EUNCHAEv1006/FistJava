package week02.operator;

public class W06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int val = ++a + b--; // a 는 연산전에 +1, b 는 연산후에 -1

        System.out.println(a); // 11
        System.out.println(b); // 9
        System.out.println(val); // 21
    }
}
