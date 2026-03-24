import java.util.Scanner;

public class TaskEight {
    public static int getSum(int num) {
        if (num == 0) {
            return 0;
        }
        return getSum(num / 10) + (num % 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        
        System.out.println(getSum(val));
    }
}