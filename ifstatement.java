import java.util.Scanner;

public class ifstatement
{
    public static void main(String[] args)
    {
        Scanner sn =new Scanner(System.in);
        System.out.print("Enter value A: ");
        int a =sn.nextInt();
        System.out.print("Enter value B: ");
        int b =sn.nextInt();
        System.out.println("performing if statements");
        if(a>b)
            {
                System.out.println(a+" is greater than "+b);
            }
        else if (a==b)
            {
               System.out.println(a+" is equalto "+b);
            }
        else
            {
                System.out.println(b+" is greater than "+a);
            }
    }
}
