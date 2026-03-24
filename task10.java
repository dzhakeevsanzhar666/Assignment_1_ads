import java.util.Scanner;

public class TaskTen {
    public static int findGcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return findGcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();

        System.out.println(findGcd(num1, num2));
    }
}