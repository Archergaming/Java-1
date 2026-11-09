import java.lang.*;
import java.util.Scanner;
public class grade{
    public static void main(String[]args){
        System.out.println("Grade calculater");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        float percentage=input.nextFloat();
        if(percentage>100 || percentage<0){
            System.out.println("Invalid percentage.");
        }else if(percentage>=90){
            System.out.println("Great! You have got A.");
        }else if(percentage>=75){
            System.out.println("Good! You have got B.");
        }else if(percentage>=60){
            System.out.println("You have got C.");
        }else if(percentage>=30){
            System.out.println("You have got D.");
        }else{
            System.out.println("Sorry, you have failed.");
        }

} 
}