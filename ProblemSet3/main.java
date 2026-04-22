import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter weight: ");

        double weight =  scan.nextDouble();
        double height =   scan.nextDouble();

        BMI calc = new BMI();
        calc.solveBMI(weight, height);

        scan.close();
    }
    
}
