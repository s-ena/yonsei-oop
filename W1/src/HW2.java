package W1;

public class HW2 {
    public static void main(String[] args) {
        double dInM = 2 * Math.PI * 50;
        double threeDinM = 3 * dInM;

        double kmPerSec = (double) 12 / 3600;
        double mPerSec = kmPerSec * 1000;

        double ans = threeDinM / mPerSec;
        System.out.printf("%.2f sec", ans);
    }
}
