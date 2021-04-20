import java.util.Scanner;

public class B76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String d= "";
        for(int i=s.length()-1;i>=0;i--)
        {
            d += s.charAt(i);
        }
        System.out.println(d);
    }
}
