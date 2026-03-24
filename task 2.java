import java.util.Scanner;

public class TaskTwo {
    public static int calculateTotal(Scanner reader, int remaining) {
        if (remaining <= 0) {
            return 0;
        }
        return reader.nextInt() + calculateTotal(reader, remaining - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        
        int totalSum = calculateTotal(input, count);
        double meanValue = (double) totalSum / count;

        System.out.println(meanValue);
    }
}