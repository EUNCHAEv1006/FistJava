package week02.operator;

public class W17 {
    public static void main(String[] args) {


        // 구구단 생성기
        for (int i = 2; i <= 9; i++) { // 구구단 첫번째 지수 i
            for (int j = 2; j <= 9; j++) { // 구구단 두번째 지수 j
                System.out.println(i + "곱하기 " + j + "는 " + (i * j) + "입니다.");
            }
        }
    }
}
