import java.util.Scanner;

public class varanddata {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        System.out.println("performing arithmetic operation: ");
        System.out.print("enter an integer value: ");
        int a1 =sn.nextInt();
        System.out.print("enter an floating value: ");
        float a2 =sn.nextFloat();
        System.out.print("enter an charecter value: ");
        char a3 =sn.next().charAt(0);
        System.out.print("enter an String value: ");
        String a4 =sn.next();
        System.out.print("enter an double value: ");
        double a5 =sn.nextDouble();
        System.out.println("integer value is: "+a1);
        System.out.println("floating value is: "+a2);
        System.out.println("charecter value is: "+a3);
        System.out.println("String value is: "+a4);
        System.out.println("Double value is: "+a5);
    }
}
