import java.util.Scanner;

public class nestedif {
    //use nestedif.java
    public static void main(String[] args)
    {
        Scanner sn =new Scanner(System.in);
//    getting mark from user
        System.out.print("Enter your marks (0-100): ");
        int mark = sn.nextInt();
//        check mark  for assign grade
//        if mark is between 100-90
        if(mark<=100 && mark>=90)
            {
                System.out.println("grade is A");
            }
//        if mark is between 89-75
        else if (mark<90 && mark>=75)
            {
              System.out.println("grade is B");
            }
//        if mark is between 74-60
        else if (mark<75 && mark>=60)
            {
              System.out.println("grade is C");
            }
//        if mark is between 59-40
        else if (mark<60 && mark>=40)
            {
               System.out.println("grade is D");
            }
//        if mark is below 40
        else if(mark<40)
            {
             System.out.println("sorry you are failed");
            }
        // invalid entry
        else
            {
                System.out.println("enter valid marks !");
            }
    }
}
