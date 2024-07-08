import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args){
        Scanner sn =new Scanner(System.in);
        System.out.println("Performing Arithmetic operator: ");
        System.out.print("Enter an value of a: ");
        int a=sn.nextInt();
        System.out.print("Enter an value of b: ");
        int b=sn.nextInt();
        System.out.println("performing add: "+(a+b));
        System.out.println("performing sub: "+(a-b));
        System.out.println("performing mul: "+(a*b));
        System.out.println("performing div: "+(a/b));
        System.out.println("performing mod: "+(a%b));
    }
}

