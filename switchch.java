import java.util.Scanner;

public class switchch {
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        //getting value from user
        System.out.print("enter value (1-2): ");
        int a = sn.nextInt();
        //enter switch and pass the user value in switch (A) case
        // if user enter 1 enter into case 1 , user enter 2 enter case 2 otherwise execute default
        //break is used for cut down case after execute
        //continue is used for skip the current case and execute next case
        switch (a)
        {
            case 1:
                System.out.println("case1 executed");
                //getting value from user
                System.out.print("Enter value between 1-5: ");
                int b=sn.nextInt();
                //same as switch(A)
                switch (b)
                {
                    case 1:
                        System.out.println("case1.2 executed: "+b);
                        break;
                    case 2:
                        System.out.println("case1.2 executed: "+b);
                        break;
                    case 3:
                        System.out.println("case1.2 executed: "+b);
                        break;
                    case 4:
                        System.out.println("case1.2 executed: "+b);
                        break;
                    case 5:
                        System.out.println("case1.2 executed: "+b);
                        break;
                    default:
                        System.out.println("1.2 invalid!");

                }
                break;
            case 2:
                 System.out.println("case 2 executed: ");
                 break;
            default:
                System.out.println("invalid!");

            }
    }
}
