import java.util.Scanner;

class perform
{
    static void get()
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Select any one option: ");
        int sel = sn.nextInt();
//----------------------------------------------------------------------------------------------------------------------
        if(sel >=1 && sel <= 4)
        {
            System.out.print("Enter value 1: ");
            int a = sn.nextInt();
            System.out.print("Enter value 2: ");
            int b = sn.nextInt();
//----------------------------------------------------------------------------------------------------------------------
            if(sel == 1)
            {
                System.out.println("Perform Addition: "+PutCalc2.add1(a,b));
            }
            else if(sel == 2)
            {
                System.out.println("Perform Subtraction: "+PutCalc2.sub1(a,b));
            }
            else if(sel == 3)
            {
                System.out.println("Perform Multiplication: "+PutCalc2.mul1(a,b));
            }
            else
            {
                System.out.println("Perform Division: "+PutCalc2.div1(a,b));
            }
        }
//----------------------------------------------------------------------------------------------------------------------
        else
        {
            System.out.println("Enter Valid Option !");
            System.out.println("PROGRAM REVERSED");
            get();
        }
    }
}