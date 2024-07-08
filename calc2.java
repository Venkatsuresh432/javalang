import java.util.*;

public class calc2 {
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
//  --------------------------------------------------------------------------------------------------------------------
        System.out.println("perform Calculation using static method : ");
        System.out.println("1-Addition, 2-Subtraction, 3-multiplication, 4-Division");
        System.out.print("Select Any One To perform: ");
        int sel = sn.nextInt();
//  --------------------------------------------------------------------------------------------------------------------
        if(sel <= 4 && sel >= 1)
        {
            System.out.print("Enter value 1: ");
            int a = sn.nextInt();
            System.out.print("Enter value 2: ");
            int b = sn.nextInt();
            if(sel == 1)
            {
                System.out.println("Perform Addition: "+PutCalc.add1(a,b));
            }
            else if(sel == 2)
            {
                System.out.println("Perform Subtraction: "+PutCalc.sub1(a,b));
            }
            else if(sel == 3)
            {
                System.out.println("Perform Multiplication: "+PutCalc.mul1(a,b));
            }
            else
            {
                System.out.println("Perform Division: "+PutCalc.div1(a,b));
            }
        }
//  --------------------------------------------------------------------------------------------------------------------
        else
        {
         System.out.println("Enter valid option !");
        }
    }
}