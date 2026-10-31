import java.lang.*;
import java.util.Scanner;
public class triangle{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        double base=input.nextDouble();
        System.out.print("Enter the height of triangle: ");
        double height=input.nextDouble();
        double Area=(base*height)/2; 
        System.out.print("Area of triangle with base \"" +base+"\" and height \""+height+"\" is \""+Area+"\"");
    }
}