package homeworks.week01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // nextLine() : Enter를 치기 전까지 쓴 문자열을 모두 return
        // next() : 공백(Space) 전 까지 입력받은 문자열 리턴

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        float rate = sc.nextFloat(); // float형 입력할 때 사용
        String inputs[] = new String[11];

        sc.nextLine();

        for (int i = 1; i <= 10; i++){
            inputs[i] = sc.nextLine();
        }

        title = "[ " + title + " ]";  // [ 제목 ]
        System.out.println(title);

        int intRate = (int)rate; // 강제 형변환
        System.out.print("별점 : " + intRate + " ");

        double percentageRate = intRate * 100 / 5.0; // 자동 형변환
        System.out.println("(" + percentageRate + "%)");

        for (int i = 1; i <= 10; i++){
            System.out.println(i + ". " + inputs[i]);
        }
    }
}