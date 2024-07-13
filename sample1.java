import java.util.*;

public class IfSample {
    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = s.nextInt();
        if (num < 0) {
            System.out.println("negetive");
        } else {
            System.out.println("positive");
        }
    }
}
