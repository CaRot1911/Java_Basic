import java.util.Scanner;

public class B52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int i =1;
        int d = 0;
        while(i<=n)
        {
            if(n%i == 0)
                {
                   d = d+1;
                }
            i++;
        }
        System.out.println(d);
    }
}
