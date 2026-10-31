import java.lang.*;
import java.util.Scanner;
public class perimeter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the first side: ");
        double a = input.nextDouble();
        System.out.print("Enter the length of the second side: ");
        double b=input.nextDouble();
        System.out.print("Enter the length of the third side: ");
        double c=input.nextDouble();
        System.out.print("Enter the length of the fourth side: ");
        double d=input.nextDouble();
        double perimeter = a+b+c+d;
        System.out.println("The perimeter of the quadrilateral is: " + perimeter);
    }
}
