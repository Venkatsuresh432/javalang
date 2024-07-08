import java.util.Scanner;

public class relational {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        System.out.println("performing relational operator: ");
        System.out.print("enter the value a: ");
        int a=sn.nextInt();
        System.out.print("enter the value b: ");
        int b=sn.nextInt();
        System.out.println("performing a<b: "+(a<b));
        System.out.println("performing a>b: "+(a>b));
        System.out.println("performing a<=b: "+(a<=b));
        System.out.println("performing a>=b: "+(a>=b));
        System.out.println("performing a!=b: "+(a!=b));
        System.out.println("performing a==b: "+(a==b));

        String a1 = new String("test");
        String b1 = new String("bold");
        System.out.println(a1 == b1); // Output: false
    }
}



