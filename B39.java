import java.util.Scanner;
public class B39 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double a =  sc.nextDouble();
        if (a<1|| a>10)
        {
            System.out.println("The score is not valid");
        }
        else
        {
            System.out.println("The score is valid");
        }
    }
}

    