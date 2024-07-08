import java.util.Scanner;

public class RightExtraction
{
    public static void main(String[] args) {
        long a,pv = 1,num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextLong();
        while(num/pv != 0)
        {
            a = (num/pv)%10;
            pv = pv*10;
            System.out.print(a+ " ");
        }
    }
}
