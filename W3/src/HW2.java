package W3;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        String inputStr = "4\n" +
                "3 3500 4200 3800\n" +
                "5 2800 3200 3500 2900 3100\n" +
                "2 4500 4800\n" +
                "4 3300 3600 3900 3400";

        Scanner keyboard = new Scanner(inputStr);
        int numDepartments = keyboard.nextInt();

        int[][] salaries = new int[numDepartments][];
        for (int i = 0; i < numDepartments; i++) {
            int p = keyboard.nextInt();
            salaries[i] = new int[p];
            for (int j = 0; j < p; j++) {
                int s = keyboard.nextInt();
                salaries[i][j] = s;
            }
        }

        int globalMin = Integer.MAX_VALUE;
        for (int i = 0; i < salaries.length; i++) {
            int sum = 0;
            for (int j = 0; j < salaries[i].length; j++) {
                sum += salaries[i][j];
                if (salaries[i][j] < globalMin) globalMin = salaries[i][j];
            }
            System.out.printf("Department %d average: %.2f\n", i + 1, (double) sum / salaries[i].length);
        }

        System.out.println("lowest salary: " + globalMin);
    }
}
