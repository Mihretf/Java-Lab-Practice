import java.util.Scanner;
public class UsingScanner{
    public void ScanMethod(){
        String name;
        int id;
        char letterGrade;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter your name");
            name= scan.nextLine();
            System.out.println("\nEnter your ID: ");
            id = scan.nextInt();
            System.out.println("Enter your letter grade");
            letterGrade = scan.next().charAt(0);
            System.out.println("Your information is: ");
            System.out.println("\nName: "+name);
            System.out.println("id: "+id);
            System.out.println("Letter Grade: "+letterGrade);

            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Invalid input. Please enter the correct data type. ");
        }
        
        }
    }

