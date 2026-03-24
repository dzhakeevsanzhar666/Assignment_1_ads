import java.util.Scanner;

public class TaskSix {
    public static int calcPow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * calcPow(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int exp = in.nextInt();
        
        System.out.println(calcPow(num, exp));
    }
}