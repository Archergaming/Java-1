import java.lang.*;
import java.util.Scanner;
public class perimeter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the first side: ");
        int a = input.nextInt();
        System.out.print("Enter the length of the second side: ");
        int b=input.nextInt();
        System.out.print("Enter the length of the third side: ");
        int c=input.nextInt();
        System.out.print("Enter the length of the fourth side: ");
        int d=input.nextInt();
        int perimeter = a+b+c+d;
        System.out.print("The perimeter of the quadrilateral is: " + perimeter);
    }
}
