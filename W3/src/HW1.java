package W3;

public class HW1 {
    public static void main(String[] args) {
        String[] inputs = {"hello", "world", "Stack", "12345", "Java Programming", "a", "", "racecar", "ABCD", "!@#$%"};

        for (String str : inputs) {
            System.out.print("input: \"" + str + "\" ");

            char[] stack = new char[str.length()];
            for (int i = 0; i < str.length(); i++) stack[i] = str.charAt(i);

            System.out.print("reversed: \"");

            for (int i = stack.length - 1; i >= 0; i--) System.out.print(stack[i]);

            System.out.print("\"\n");
        }
    }
}
