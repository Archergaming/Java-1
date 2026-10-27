import java.lang.*;
import java.util.Scanner;
public class sum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Integer: ");
        int a=sc.nextInt();
        System.out.print("Enter the Second Integer: ");
        int  b=sc.nextInt();
        int sum= a+b;
        System.out.print("Sum of "+a+" And "+b+" is "+sum);
    }
}
