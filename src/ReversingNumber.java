import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        long num, a, res = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextLong();
        // right extraction and right construction.
        while (num != 0) {
            a = num % 10;
            num /= 10;
            res = res * 10 + a;
        }
        System.out.println(res);
    }
}
