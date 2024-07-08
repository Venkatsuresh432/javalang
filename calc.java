import java.util.*;
public class calc {
    public static void main(String[] args)
    {
        Scanner sn =new Scanner(System.in);
        addition ad=new addition();
        subtraction sb=new subtraction();
        multiplication ml=new multiplication();
        division dv=new division();
//        --------------------------------------------------------------------------------------------------------------
        System.out.println("Perform Mathematics: ");
        System.out.println("1-Addition, 2-Subtraction, 3-multiplication, 4-Division");
        System.out.print("Select Any One To perform: ");
        int sel = sn.nextInt();
//      ----------------------------------------------------------------------------------------------------------------
        if(sel<=4 && sel>=1)
        {
            System.out.print("Enter value 1: ");
            int a = sn.nextInt();
            System.out.print("Enter value 2: ");
            int b = sn.nextInt();
//      ----------------------------------------------------------------------------------------------------------------
            switch (sel) {
                case 1: {

                    System.out.println("Perform Addition: " +ad.add(a, b));
                    break;
                }
                case 2: {
                    int res = sb.sub(a, b);
                    System.out.println("Perform Subtraction : " + res);
                    break;
                }
                case 3: {
                    int res = ml.mul(a, b);
                    System.out.println("Perform Multiplication: " + res);
                    break;
                }
                case 4: {
                    int res = dv.div(a, b);
                    System.out.println("Perform Division: " + res);
                    break;
                }
//                default:
//                    System.out.println("invalid");
            }
        }
        else
        {
            System.out.println("Enter valid option !");
        }
    }
}
// ---------------------------------------------------------------------------------------------------------------------
class addition {
    public int add(int a,int b)
    {
        int c =a+b;
        return c;
    }
}
class subtraction{
    public int sub(int a1,int a2)
    {
        int c =a1+a2;
        return c;
    }
}
class multiplication{
    public int mul(int a1,int a2)
    {
        int c =a1+a2;
        return c;
    }
}
class division{
    public int div(int a1,int a2)
    {
        int c =a1+a2;
        return c;
    }
}
