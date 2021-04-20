import java.sql.SQLOutput;
import java.util.Scanner;

public class B48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        for(int i=1;i<=n;i++)
        {
            s = s*i;
        }
        System.out.print(s);
    }
}
