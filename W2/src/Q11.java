public class Q11 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 8; i++)
            if (i % 2 == 0)
                sum += i;
            else if (i % 3 == 0)
                sum += 2 * i;
            else
                sum += 1;

        System.out.println(sum);
    }
}
