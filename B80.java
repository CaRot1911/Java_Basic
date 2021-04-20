import java.util.Scanner;

public class B80 {
    public static double cv(double r){
        return 2*r*3.14;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(cv(r));

    }
}
