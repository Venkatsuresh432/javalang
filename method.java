import java.util.Scanner;

public class method {//method definition
    static int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
      int c=a-b;
      return c;
    }
    public static void main(String[] args)
    {
        Scanner sn =new Scanner(System.in);
        method mt = new method();
        System.out.println(add(12,3));//passing args
        System.out.print("enter value 1 :");
        int a1= sn.nextInt();
        System.out.print("enter value 2 :");
        int a2= sn.nextInt();
        System.out.println(mt.sub(a1,a2));
    }
}
