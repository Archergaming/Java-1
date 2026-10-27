import java.lang.*;
import java.util.Scanner;
public class sum{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the First Integer: ");
        int a=input.nextInt();
        System.out.print("Enter the Second Integer: ");
        int  b=input.nextInt();
        int sum= a+b;
        System.out.print("Sum of "+a+" And "+b+" is "+sum);
    }
}
