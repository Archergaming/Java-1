import java.lang.*;
import java.util.Scanner;
public class input {
    public static void main(String[]args){
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = newScanner.nextLine();
        System.out.println("Welcome, " + name +" to KG Coding");
    }
}
