import java.util.Scanner;

public class RightConstruction {
    public static void main(String[] args) {
        long a,res=0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            a = sc.nextLong();
            if(a == -1)
                break;
            res = res * 10 + a;
            System.out.println(res);
        }
    }
}
