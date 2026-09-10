// create a Rectangle class with:
// length
// breadth
import java.util.Scanner;

class Area{
    int length;
    int breadth;

    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void displayArea(){
        System.out.println("Length: " + length);
        System.out.println("breath: " + breadth);
        System.out.println("Area = "+ length * breadth);
        System.out.println("Perimeter = " + 2*(length + breadth));
    }
}      
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int length=input.nextInt();

        System.out.print("Enter the Breadth: ");
        int breadth=input.nextInt();


        Area a=new Area(length, breadth);
        a.displayArea();
    }
}
