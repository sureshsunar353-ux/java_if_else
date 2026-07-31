public class Question5 {
    public void vote(){
        int age =12;
        if(age > 18){
            System.out.println("you are eligible for vote.");
        }   
        else if(age < 18){
            System.out.println("you are not eligible for vote.");
        }
        else {
            System.out.println("error");
        }
    }
}
