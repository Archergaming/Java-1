import java.lang.*;
import java.util.Scanner;
public class floating{ 
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first floating point number:");
        float num1=input.nextFloat();
        System.out.print("Enter the second floating point number:");
        float num2=input.nextFloat();
        float product=num1*num2;
        System.out.println("The product of the "+num1+" and "+num2+" is: "+product);
    }
    
}
