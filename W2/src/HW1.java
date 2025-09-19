package W2;

public class HW1 {
    public static void main(String[] args) {
        String inputStr = "Hello, World! This is a Test.";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            int idx = inputStr.toLowerCase().indexOf(alphabet.charAt(i));
            if (idx == -1) continue;
            System.out.print(alphabet.charAt(i) + " : " + idx + "\n");
        }
    }
}
