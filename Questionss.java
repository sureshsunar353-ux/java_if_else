import java.util.Scanner;

class Account{
    double balance;

   void deposit(double amount){
    if(amount > 0){
        balance = balance + amount;
        System.out.println("Amount successfully deposited");
    }
    else{
        System.out.println("Invalid deposit amount");
    }
   }

 void withdraw(double amount){
    if(amount <=0){
        System.out.println("invalid withdraw amount");
    }
    else if(amount > balance){
        System.out.println("Insufficient amount");
        }
    else{
        balance = balance - amount;
        System.out.println("Amount withdraw successfully");
    }
    }
    void display(){
       System.out.println("Your current balance: Rs. " + balance);
    }
 }

 public class Questionss{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Enter deposit amount: ");
        double depositAmount = input.nextDouble();

        account.deposit(depositAmount);
        account.display();

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = input.nextDouble();

        account.withdraw(withdrawAmount);
        account.display();

    }
 }
