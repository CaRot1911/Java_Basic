import java.util.Scanner;

public class B63 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a  =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int d =0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                d = d+1;
            }
        }
        System.out.println(d);
    }
}
