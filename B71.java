import java.util.Scanner;

public class B71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char k = sc.next().charAt(0);
        int d=0;
        for(int i=0;i<a.length();i++)
        {
            if (a.charAt(i)==k) {
                d = i;
                break;
            }
        }
        System.out.println(d);
    }
}
