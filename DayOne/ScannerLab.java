import java.util.Scanner;

public class ScannerLab { // Renamed to avoid confusion with java.util.Scanner
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int id;
        char letterGrade;

        try {
            System.out.print("Enter your name: ");
            name = scan.nextLine();

            System.out.print("Enter your ID: ");
            id = scan.nextInt();

            System.out.print("Enter the letter grade: ");
            // We use scan.next() to grab the first string and charAt(0) for the character
            letterGrade = scan.next().charAt(0);

            System.out.println("\nYour information is:");
            System.out.println("Name\tID\tGrade");
            System.out.println(name + "\t" + id + "\t" + letterGrade);

        } catch (Exception e) {
            System.out.println("Error: Please enter valid input.");
            e.printStackTrace();
        } finally {
            scan.close();
        }
    }
}