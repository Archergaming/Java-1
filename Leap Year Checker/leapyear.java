import java.lang.*;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("Leap Year Checker");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Year to check: ");
        int year=input.nextInt();
        if(year%4==0 && year%100!=0 ||year%400==0){
            System.out.print("The year " +year+" is Leap year." );
        }else{
            System.out.print("The year " +year+" is not Leap year." );
        }

    }
}
