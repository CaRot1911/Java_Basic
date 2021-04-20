import java.util.Scanner;
public class B37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c)
        {
            System.out.println(a);
        }
        if (a<=b && b>=c)
        {
            System.out.println(b);
        }
        if (a<=c && b<=c)
        {
            System.out.println(c);
        }
    }
}

