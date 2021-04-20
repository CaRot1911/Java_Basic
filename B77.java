import java.util.Scanner;

public class B77 {
    public static void Search(int[] a)
    {
        for(int i=0;i< a.length;i++)
        {
            if(a[i]%3==0 && a[i]%5!=0)
            {
                System.out.print(a[i] +" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        Search(a);
    }
}
