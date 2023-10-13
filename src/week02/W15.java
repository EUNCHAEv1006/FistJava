package week02;

public class W15 {
    public static void main(String[] args) {
        // for 문
//        for(int i=0; i < 4; i++) { // 변수 i 값은 0 ~ 3 까지 반복
//            System.out.println(i + "번째 출력"); // i 변수와 문자열 합치기
//        }


        // 향상된 for 문
//        int[] numbers = {3,6,9,12,15};
//        for(int number: numbers) {
//            System.out.print(number + " ");
//        }


        // 만약 기존 for 문으로 구현한다면?
        int[] numbers = {3,6,9,12,15};
        for(int i = 0; i < numbers.length; i++) { // 배열에 .length 를 붙이면 길이값이 응답됩니다.
            System.out.println(numbers[i]);
        }
    }

}
