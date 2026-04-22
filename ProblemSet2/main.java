import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a, b, and c");

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        quadraticsolver sol = new quadraticsolver();
        sol.solver(a, b, c);
        scan.close();

    }
}