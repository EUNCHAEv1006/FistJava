package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        // 최대값 구하기
        int[] arr = { 3, 2, 1, 5, 1 };

        // 최대값 초기값 세팅
        int max = arr[0];

        // 최대값 구하기
        for (int num : arr) {
            if (num > max) { // 반복문 돌면서 나(max)보다 값이 작으면 저장
                max = num;
            }
        }

        // 최대값 5 출력
        System.out.println("최대값은 => " + max);
    }
}
