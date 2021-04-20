import java.util.Scanner;

public class B50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(i*5 + j +" ");
            }
            System.out.println();
        }
    }
}
