import java.util.Scanner;

public class TaskSeven {
    public static String flip(String txt) {
        if (txt.isEmpty()) {
            return txt;
        }
        return flip(txt.substring(1)) + txt.charAt(0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        System.out.println(flip(s));
    }
}