import java.util.Scanner;

public class nestedif2{
    public static void main(String[] args)
    {
        Scanner sn =new Scanner(System.in);
//    getting mark from user
        System.out.print("Enter your mark1 (0-100): ");
        int mark1 = sn.nextInt();
        System.out.print("Enter your mark2 (0-100): ");
        int mark2 = sn.nextInt();
        System.out.print("Enter your mark3 (0-100): ");
        int mark3 = sn.nextInt();
        System.out.print("Enter your mark4 (0-100): ");
        int mark4 = sn.nextInt();
        System.out.print("Enter your mark5 (0-100): ");
        int mark5 = sn.nextInt();

        //mark==grade
        float mark= mark1+mark2+mark3+mark4+mark5/5;
        // check the user got an minimum mark 35
        if(mark1>=35 && mark2>=35 && mark3>=35 && mark4>=35 && mark5>=35)
        {
                    //        check average  for assign grade
                    //        if mark is between 100-90
                    if (mark <= 100 && mark >= 90) {
                        System.out.println("grade is A");
                    }
                    //        if grade is between 89-75
                    else if (mark < 90 && mark >= 75) {
                        System.out.println("grade is B");
                    }
                    //        if grade is between 74-60
                    else if (mark < 75 && mark >= 60) {
                        System.out.println("grade is C");
                    }
                    //        if grade is between 59-35
                    else if (mark < 60 && mark >= 35) {
                        System.out.println("grade is D");
                    }
        }
        // invalid entry
        else
        {
            System.out.println("Failed !");
        }
    }
}
