import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word ");

        String a =  scan.nextLine();
        stringdemo convert = new stringdemo();
        convert.Capitalize(a);
    }

    
}