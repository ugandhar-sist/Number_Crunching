import java.util.Scanner;

public class LeftExtraction {
    public static void main(String[] args) {
        long a, num, pv = 1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextLong();
        while(num/pv != 0)
        {
            pv = pv * 10;
        }
        pv = pv / 10;
        while(pv!=0)
        {
            a = (num/pv)%10;
            pv = pv/10;
            System.out.print(a+ " ");
        }
    }
}
