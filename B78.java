import java.util.Scanner;

public class B78 {
    public static void dai(String[] s)
    {
        for(int i=0;i<s.length;i++)
        {
           if (s[i].length()>3)
           {
               System.out.println(s[i]+" ");
           }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
        }
        dai(s);
    }
}
