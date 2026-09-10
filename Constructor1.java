
// create an employee class with
// id 
// name
// salary
// create a parameterized constructor to initialize all three values. 
// create a method displayemployee() to display the employee information.
// create three employee objects in main()
import java.util.Scanner;
class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id=id;
        this.name = name;
        this.salary=salary;
    }

    public void displayemployee(){
        System.out.println("your id: "+id);
        System.out.println("Your name: "+name);
        System.out.println("your salary: "+salary);
    }
}


public class Constructor1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id=input.nextInt();

        System.out.println("Enter the name: ");
        String name = input.next();

        System.out.println("Enter the salary: ");
        double salary = input.nextDouble();
        Employee emp=new Employee(id, name, salary);
       emp.displayemployee();

    }
}
