import java.util.Scanner;
// import ProblemSet1.divide;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        float a = scanner.nextFloat();

        System.out.println("Please enter the second number: ");
        float b = scanner.nextFloat();

        divide d = new divide();
        // classname objectname(i can choose) =  new classname/which is the constructor
        
        float result = d.DivideFloat(a,b);
        System.out.println(" The division of the number results: " + result);
    }
    
}
