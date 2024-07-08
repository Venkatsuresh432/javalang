import java.util.*;
public class arr1
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("performing Array Values");
        System.out.print("Enter array size: ");
        int sz = sn.nextInt();
        int []a = new int[sz];

        for(int i=0;i<sz;i++)
        {
           System.out.print("enter array value: "+(i+1)+":");
           a[i]=sn.nextInt();
        }
        for(int i=0;i<sz;i++)
        {
            System.out.println("Print Array values: "+a[i]);
        }
    }
}
