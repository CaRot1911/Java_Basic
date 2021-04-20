import java.util.Scanner;

public class B74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int d =0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>='A' && a.charAt(i)<='Z')
            {
                d++;
            }
        }
        System.out.println(d);
    }
}
