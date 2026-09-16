// Question 1 — Student
// Create a Student class with:

// id
// name
// age

// Create the following overloaded constructors:

// Constructor with no arguments
// Constructor with id and name
// Constructor with id, name, and age

// Create three Student objects using the three different constructors and display their information.

class Student{
    int id;
    String name;
    int age;

    Student(int i, String n){
        id= i;
        name =n;
    }

    Student(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    void dispaly(){
        System.out.println(id + " " + name + " " + age );
    }

}
public class Copyconstructor {
    public static void main(String[] args) {
        
        Student s2 = new Student(1, "Ram");
        Student s3 = new Student(1, "Ram", 12);
       
        s2.dispaly();
        s3.dispaly();
    }
}
