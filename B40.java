import java.util.Scanner;
public class B40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && b>=c)
        {
            System.out.print("decreasing");
        }
        else if (a<=b && b<=c)
        {
            System.out.print("increasing");
        }
        else
        {
            System.out.print("neither increasing nor decreasing order");
        }
    }
}

