// 1. Write a program to check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class Question1{
    public void find(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        if(num > 0){
            System.out.println("The number " + num + " is positive.");
        }
        else if(num < 0){
            System.out.println("The number " + num + " is negative.");
        }
        else{
            System.out.println("It is zero");
        }
    }
}