package W3;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        String[] inputs = {
                "8 3 2 5 4 7 1 6 9",
                "1 2 3 4 5 4 3 2 1",
                "5 5 5 5 5 5 5 5 5",
                "2 1 2 1 2 1 2 1 2",
                "1 2 3 4 5 6 7 8 9"
        };

        for (String input : inputs) {
            System.out.print("Input: " + input + " the number of valley elements:");

            int valleyCnt = 0;
            int[] targets = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int i = 1; i < targets.length - 1; i++) {
                int target = (int) targets[i];
                int prev = (int) targets[i - 1];
                int next = (int) targets[i + 1];
                boolean isValley = target < prev && target < next;
                if (isValley) valleyCnt++;
            }

            System.out.println(" " + valleyCnt);
        }
    }
}
