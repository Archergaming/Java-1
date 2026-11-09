import java.lang.*;
import java.util.Scanner;

public class citizen {
    public static void main(String[]args){
        
    System.out.println("Welcome to citizen sorter");   
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age=input.nextInt();
    if(age<=13){
        System.out.println("You are a child");
    }else if(age<=20){
        System.out.println("You are a teenager");
    }else if(age<=60){
        System.out.println("You are an adult");
    }else if(age>60){
        System.out.println("You are a senior citizen");
    }
  }
}
