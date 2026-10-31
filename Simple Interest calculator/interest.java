import java.lang.*;
import java.util.Scanner;
public class interest{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int prize=input.nextInt();
        System.out.print("Enter the amout of time(months): ");
        int time=input.nextInt();
        System.out.print("Enter the interest rate: ");
        double rate=input.nextDouble();
        double interestAmount=(prize*time*rate)/100;
        System.out.print("The amount of interest is "+interestAmount+"$");

    }
}