import java.util.Scanner;

public class B64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int s = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1 && a[i]>0)
            {
                s = s + a[i];
            }
        }
        System.out.println(s);
    }
}
