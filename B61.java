import java.util.Scanner;

public class B61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int s = 0;
        for(int i=0;i<n;i++)
        {
            s = a[0]+a[n-1];
        }
        System.out.println(s);
    }
}
