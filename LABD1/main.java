import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        try {
            UsingScanner us= new UsingScanner();
            us.ScanMethod();
            geometry dm2 = new geometry();
            Scanner scan = new Scanner(System.in);
            int l,w;
            double r;
            scan.nextLine();

            System.out.println("\nEnter the length and width of the rectangle");
            l= scan.nextInt();
            w= scan.nextInt();

            System.out.println("\n Area of rectangle: " + dm2.recArea(l, w));
            System.out.println("Enter the radius of the cirlce: ");
            r= scan.nextDouble();
            System.out.println("Area of cirlce: "+ dm2.recCircle(r));
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Invalid input data type. " + e.getStackTrace());
        }
    }
}
