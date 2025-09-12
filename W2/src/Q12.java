import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        String str = "SEOUL\nHELLO KOREA";
        Scanner keyboard = new Scanner(str);
        String s1 = keyboard.next();
        keyboard.nextLine();
        String s2 = keyboard.nextLine();
        System.out.println(s1);
        System.out.println(s2);
    }
}
