import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        float rate = sc.nextFloat();
        sc.nextLine();

        String[] inputs = new String[10];

        for (int i = 0; i < 10; i++) {
            inputs[i] = sc.nextLine();
        }

        title = "[ " + title + " ]";
        System.out.println(title);

        int intRate = (int) rate;
        System.out.print("별점 : " + intRate);
        double percentageRate = intRate * 100 / 5.0;
        System.out.println(" (" + percentageRate + "%)");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + inputs[i]);
        }
    }
}
