package W2;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        String inputStr = "2000 FEB 1900 FEB 2020 FEB 2021 FEB 2016 MAR 2019 NOV 2100 FEB 2400 FEB 1996 APR 2004 OCT";
        Scanner sc = new Scanner(inputStr);

        int i = 0;
        while (i < inputStr.split(" ").length / 2) {
            int y = sc.nextInt();
            boolean isLeap = false;

            if (y % 400 == 0) isLeap = true;
            else if (y % 100 == 0) isLeap = false;
            else if (y % 4 == 0) isLeap = true;

            String m = sc.next();
            int d = 0;

            switch (m) {
                case "FEB":
                    d = isLeap ? 29 : 28;
                    break;

                case "MAR":
                case "OCT":
                    d = 31;
                    break;

                case "APR":
                case "NOV":
                    d = 30;
                    break;
            }

            System.out.println(y + " " + m + ": " + d);
            i++;
        }
    }
}
