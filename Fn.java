import java.util.Scanner;

public class Fn {
    public static void main(String a[]) {
        Scanner sca = new Scanner(System.in);
        System.out.println("enter 2 numbers;");
        int num1 = sca.nextInt();
        int num2 = sca.nextInt();

        int result = sum(num1, num2);
        System.out.println("result is " + result);
    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}