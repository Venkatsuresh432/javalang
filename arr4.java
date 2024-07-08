import java.util.Scanner;

public class arr4 {
    public static void main(String[] args)
    {
        Scanner sn= new Scanner(System.in);
        System.out.print("Enter Size of an Array: ");
        int size = sn.nextInt();
        String[] st =new String[size];
        sn.nextLine();
        for(int i=0;i<size;i++)
        {
            System.out.print("enter String of "+(i+1)+": ");
            st[i] = sn.nextLine();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("Print string: "+st[i]);
        }
    }
}
