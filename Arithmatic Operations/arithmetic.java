import java.lang.*;
import java.util.Scanner;           
public class arithmetic{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first Integer: ");
        int a=input.nextInt();
        System.out.print("Enter the second Integer: ");
        int b=input.nextInt();
        int sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);
        
        int difference=a-b;
        System.out.println("The difference of "+a+" and "+b+" is: "+difference);
        int product=a*b;
        System.out.println("The product of "+a+" and "+b+" is: "+product);
        int quotient=a/b;
        System.out.println("The quotient of "+a+" and "+b+" is: "+quotient);
        int modulus=a%b;
        System.out.println("The modulus of "+a+" and "+b+" is: "+modulus);
        }
        
    }
