import java.util.Scanner;

public class B66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i, j;
        for(i = 0; i < n; i++)
        {
            for (j = i + 1; j < n; j++) {
               if(a[i]>a[j])
               {
                   int tg = a[i];
                   a[i] = a[j];
                   a[j] = tg;
               }

            }
        }
        for(i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }

    }
}
