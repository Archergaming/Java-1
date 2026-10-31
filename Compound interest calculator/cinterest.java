import java.lang.*;
import java.util.Scanner;
public class cinterest {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int prize=input.nextInt();
        System.out.print("Enter the time period(months): ");
        int time=input.nextInt();
        System.out.print("Enter the interest rate: ");
        double rate=input.nextDouble();
        double compInterest=prize*Math.pow((1+ rate/100),time);
        System.out.println("The compound interest is: " + compInterest+"$");
    }
}