import java.util.Scanner;

public class TaskOne {
    public static void showNumbers(int currentNum) {
        if (currentNum >= 10) {
            showNumbers(currentNum / 10);
        }
        System.out.println(currentNum % 10);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int inputVal = reader.nextInt();
        showNumbers(inputVal);
    }
}