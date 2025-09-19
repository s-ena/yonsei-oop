package W2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        String inputStr = "6 10 15 20 25";
        Scanner sc = new Scanner(inputStr);

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            int sum = 0;
            String ans = "NO";

            for (int j = 1; j <= num; j++) {
                sum += j;
                if (sum == num) {
                    ans = "YES";
                    break;
                }
            }

            System.out.println(num + " " + ans);
        }
    }
}

