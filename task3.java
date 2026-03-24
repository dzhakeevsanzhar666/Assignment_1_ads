import java.util.Scanner;

public class PrimeTester {
    public static boolean checkPrimality(int value, int divisor) {
        if (value < 2) return false;
        if (value == 2) return true;
        if (value % divisor == 0) return false;
        if (divisor * divisor > value) return true;

        return checkPrimality(value, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        String result = checkPrimality(target, 2) ? "Prime" : "Composite";
        System.out.println(result);
    }
}