import java.util.Scanner;

public class LeftConstruction {
    public static void main(String[] args) {
        long  res = 0, x = 1, a;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            a = sc.nextLong();
            if(a == -1)
                break;
            res = a * x + res;
            x = x * 10;
            System.out.println(res);
        }
    }
}
