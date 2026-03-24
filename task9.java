import java.util.Scanner;

public class TaskNine {
    public static boolean checkPali(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return checkPali(text, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        if (checkPali(line, 0, line.length() - 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}