import java.util.Scanner;
public class B47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for(int i=1;i<=n;i++)
        {
            if(i%2 == 1)
            {
                s = s +i;
            }
        }
        System.out.println(s);
    }
}
